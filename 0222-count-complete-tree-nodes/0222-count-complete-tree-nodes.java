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
    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        List<Integer> list=new ArrayList<>();
        preOrder(root,list);
        return list.size();
    }
    private void preOrder(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}