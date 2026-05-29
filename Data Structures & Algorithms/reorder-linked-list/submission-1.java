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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;

        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
       
       ListNode list1=head;
       ListNode list2=prev;

       while(list2!=null){
        ListNode tmp1=list1.next;
        ListNode tmp2=list2.next;

        list1.next=list2;
        list2.next=tmp1;

        list1=tmp1;
        list2=tmp2;
       }
    }
}
