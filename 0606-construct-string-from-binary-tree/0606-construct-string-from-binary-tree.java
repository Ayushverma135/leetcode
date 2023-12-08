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
    public static void traverse(TreeNode root,StringBuilder str){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            str.append(Integer.toString(root.val));
            return;
        }
        str.append(Integer.toString(root.val));
        str.append("(");
        traverse(root.left,str);
        str.append(")");
        if(root.right!=null){
            str.append("(");
            traverse(root.right,str);
            str.append(")");
        }
    }
    public String tree2str(TreeNode root) {
        StringBuilder r=new StringBuilder();
        traverse(root,r);
        return r.toString();
    }
}