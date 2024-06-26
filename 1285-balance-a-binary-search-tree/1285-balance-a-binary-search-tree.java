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
    public TreeNode solve(List<Integer> arr, int i,int j){
        if(i>j){
            return null;
        }
        int mid=i+(j-i)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=solve(arr,i,mid-1);
        root.right=solve(arr,mid+1,j);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        traverse(root,arr);
        return solve(arr,0,arr.size()-1);
    }
}