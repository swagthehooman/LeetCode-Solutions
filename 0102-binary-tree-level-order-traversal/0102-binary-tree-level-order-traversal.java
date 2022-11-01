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
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new ArrayDeque<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                arr.add(temp.val);
                
                if(temp.left != null)
                    q.offer(temp.left);
                
                if(temp.right != null)
                    q.offer(temp.right);
            }
            list.add(arr);
        }
        return list;
    }
    
}