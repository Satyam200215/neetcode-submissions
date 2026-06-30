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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //if p and q> root, ancestor will be on right subtree
        //if p and q<root, ancestor will be on left subtree
        // otherwise if p and q are split, ancestor will be root

        if(p.val<root.val && q.val<root.val){
            
           return lowestCommonAncestor(root.left,p,q);
        }

        else if(p.val>root.val && q.val>root.val){
           
           return lowestCommonAncestor(root.right,p,q);
        }
 return root;
    }
}
