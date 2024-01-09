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
    static int sum=0;
    public int traverse(TreeNode root,int low,int high){
        if(root==null){return 0;}
        int left=traverse(root.left,low,high);
        int right=traverse(root.right,low,high);
        if(root.val>=low && root.val<=high){
            return left+right+root.val;
        }
        else{return left+right;}
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return traverse(root,low,high);
    }
}