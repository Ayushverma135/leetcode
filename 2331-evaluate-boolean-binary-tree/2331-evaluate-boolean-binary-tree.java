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
    public boolean traverse(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==1?true:false;
        }
        boolean left= traverse(root.left);
        boolean right=traverse(root.right);
        boolean res;
        if(root.val==2){
            res=left || right;
        } 
        else{
            res=left && right;
        }
        return res;
    }
    public boolean evaluateTree(TreeNode root) {
        return traverse(root);
    }
}