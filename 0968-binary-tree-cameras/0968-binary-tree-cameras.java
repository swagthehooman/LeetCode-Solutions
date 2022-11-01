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
    int ans;
    Set<TreeNode> covered;
    public int minCameraCover(TreeNode root) {
        ans=0;
        covered=new HashSet<>();
        covered.add(null);
        
        dfs(root, null);
        return ans;
    }
    
    private void dfs(TreeNode root, TreeNode parent){
        if(root!=null){
            dfs(root.left,root);
            dfs(root.right,root);
            
            if(parent==null && !covered.contains(root) || !covered.contains(root.left) || !covered.contains(root.right)){
                ans++;
                covered.add(root);
                covered.add(root.left);
                covered.add(root.right);
                covered.add(parent);
            }
        }
    }
    
}