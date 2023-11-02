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
    int flag=0;
    int sumOfTree(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=sumOfTree(root.left);
        int r=sumOfTree(root.right);
        return root.val+l+r;
    }
    int countNode(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=countNode(root.left);
        int r=countNode(root.right);
        return 1+l+r;
    }
    void Traverse(TreeNode root){
        if(root==null){
            return;
        }
        Traverse(root.left);
        int s=sumOfTree(root);
        int c=countNode(root);
        if((int)s/c==root.val){
            flag++;
        }
        Traverse(root.right);

    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        Traverse(root);
        return flag;
    }
}