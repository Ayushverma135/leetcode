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
    public void traverse(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        traverse(root.left,arr);
        arr.add(root.val);
        traverse(root.right,arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res=new ArrayList<>();
        traverse(root,res);
        return res.get(k-1);
    }
}