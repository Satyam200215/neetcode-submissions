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
    public int kthSmallest(TreeNode root, int k) {
           List<Integer> res=new ArrayList<>();
           traverse(root,res);
           Collections.sort(res);
           int small=res.get(k-1);
    return small;
    }
    private static void traverse(TreeNode root,List<Integer> res){
        if(root==null)
           return ;
        
        res.add(root.val);
        traverse(root.left,res);
        traverse(root.right,res);
    }
}
