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
    ArrayList<Integer> arr=new ArrayList<>();
    public void BST(TreeNode root){
        if(root==null){
            return;
        }
        BST(root.left);
        arr.add(root.val);
        BST(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        BST(root);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)){
                return false;
            }
        }
        System.out.println(arr);
        return true;
    }
}