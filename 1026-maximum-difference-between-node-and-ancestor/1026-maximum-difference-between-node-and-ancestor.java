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
    int res=0;
    public void traverse(TreeNode root,int min,int max){
        if(root==null){
            return;
        }
        res=Math.max(res,Math.max(Math.abs(min-root.val),Math.abs(max-root.val)));
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);
        traverse(root.left,min,max);
        traverse(root.right,min,max);
    }
    public int maxAncestorDiff(TreeNode root) {
        int min=root.val;
        int max=root.val;
        traverse(root,min,max);
        return res;
    }
}