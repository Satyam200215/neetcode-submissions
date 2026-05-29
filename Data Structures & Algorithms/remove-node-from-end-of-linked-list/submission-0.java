/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        int totalnodes=0;
        ListNode curr=head;
        while(curr!=null){
            totalnodes++;
            curr=curr.next;
        }
        int ans=totalnodes-n;
        if(ans==0)
           return head.next;
        
        ListNode prev=head;
        
        for(int i=0;i<ans-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;

    return head;
    }
}
