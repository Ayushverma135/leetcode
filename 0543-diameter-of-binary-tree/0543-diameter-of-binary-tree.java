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
    public int traverse(TreeNode root,int res[]){
        if(root==null){
            return 0;
        }
        int left=traverse(root.left,res);
        int right=traverse(root.right,res);
        res[0]=Math.max(res[0],left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int res[]=new int[1];
        traverse(root,res);
        return res[0];
    }
}