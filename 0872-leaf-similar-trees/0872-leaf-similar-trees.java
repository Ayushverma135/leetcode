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
        if(root==null){return;}
        if(root.left==null && root.right==null){
            arr.add(root.val);
        }
        traverse(root.left,arr);
        traverse(root.right,arr);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        traverse(root1,arr1);
        traverse(root2,arr2);
        if(arr1.size()!=arr2.size()){return false;}
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)!=arr2.get(i)){
                return false;
            }
        }
        return true;
    }
}