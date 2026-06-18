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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
          return null;

        Queue<TreeNode> ans=new LinkedList<>();
        ans.add(root);

        while(!ans.isEmpty()){
            TreeNode curr=ans.poll();

            TreeNode temp=curr.left;
            curr.left=curr.right;
            curr.right=temp;
            if(curr.left!=null)
               ans.add(curr.left);
            if(curr.right!=null)
               ans.add(curr.right);
            
        }
        return root;
    }
}
