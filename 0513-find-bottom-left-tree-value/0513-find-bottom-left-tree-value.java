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
    public void traverse(TreeNode root,int res[],int h){
        if(root==null){
            return;
        }
        if(h>res[1]){
            res[1]=h;
            res[0]=root.val;
        }
        traverse(root.left,res,h+1);
        traverse(root.right,res,h+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        int res[]=new int[2];
        res[1]=-1;
        traverse(root,res,0);
        return res[0];
    }
}