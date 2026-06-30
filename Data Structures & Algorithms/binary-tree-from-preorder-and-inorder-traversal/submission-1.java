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
       private int preIndex=0;
       private HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          this.preIndex=0;
          this.map.clear();
           for(int i=0;i<inorder.length;i++){
               map.put(inorder[i],i);
           }
           return buildTree(preorder,0,inorder.length-1);
    }

    private  TreeNode buildTree(int[] preorder, int start, int end){
           if(start>end)
              return null;
        
          int rootval=preorder[preIndex++];
          TreeNode root=new TreeNode(rootval);

          int index=map.get(rootval);

          root.left=buildTree(preorder,start,index-1);

          root.right=buildTree(preorder,index+1,end);

        return root;
    }
}
