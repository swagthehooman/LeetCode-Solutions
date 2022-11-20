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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new ArrayDeque<>();
        q.offer(root);
        int sum=0,i=0;
        while(!q.isEmpty()){
            int len=q.size();
            for(i=0,sum=0;i<len;i++){
                TreeNode temp=q.poll();
                //System.out.print(temp.val+" ");
                sum+=temp.val;
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            //System.out.println();
        }
        return sum;
    }
}