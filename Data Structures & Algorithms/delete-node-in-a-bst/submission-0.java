/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode temp=root;
        TreeNode parent=null;
     while(temp!=null){
        if(key<temp.val){
           parent=temp;
           temp=temp.left;
        }
        else if(key>temp.val){
           parent=temp;
           temp=temp.right;
        }
        else{
            if(temp.left!=null && temp.right!=null){
                TreeNode successorParent=temp;
                TreeNode successor=temp.right;
                while(successor.left!=null){
                    successorParent=successor;
                    successor=successor.left;
                }
                temp.val=successor.val;

                if (successorParent.left==successor)
                   successorParent.left=successor.right;
                else
                  successorParent.right=successor.right;
            }
            else{
                TreeNode child=(temp.left!=null)? temp.left : temp.right;
                
                if(parent==null)
                   return child;

                if(parent.left==temp){
                    parent.left=child;
                }
                if(parent.right==temp){
                    parent.right=child;
                }
            }
            break;
        }
     }
     return root;
    }
}