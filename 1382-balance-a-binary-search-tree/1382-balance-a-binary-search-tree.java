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
    ArrayList<TreeNode> tree=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return balancedTree(0,tree.size()-1);
    }
    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        tree.add(root);
        inorder(root.right);
    }
    private TreeNode balancedTree(int start, int end){
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=tree.get(mid);
        root.left=balancedTree(start, mid-1);
        root.right=balancedTree(mid+1,end);
        return root;
    }
}