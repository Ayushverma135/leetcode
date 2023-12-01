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
    int h1=0;
    int h2=-1;
    TreeNode p1=null;
    TreeNode p2=null;
    public void traverse(TreeNode root,int x,int y,int h,TreeNode parent){
        if(root==null){
            return;
        }
        if(root.val == x){
            h1=h;
            p1=parent;
        }
        else if(root.val==y){
            h2=h;
            p2=parent;
        }
        traverse(root.left,x,y,h+1,root);
        traverse(root.right,x,y,h+1,root);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root,x,y,0,null);
        return (h1==h2)&&(p1!=p2);
    }
}