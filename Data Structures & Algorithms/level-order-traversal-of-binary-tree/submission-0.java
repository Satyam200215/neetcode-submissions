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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)
           return res;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int level=queue.size();
            List<Integer> curr=new ArrayList<>();

            for(int i=0;i<level;i++){
                TreeNode currnode=queue.poll();
                curr.add(currnode.val);

                if(currnode.left!=null)
                   queue.add(currnode.left);
                if(currnode.right!=null)
                   queue.add(currnode.right);
            }
          res.add(curr);
        }

        return res;
    }
}
