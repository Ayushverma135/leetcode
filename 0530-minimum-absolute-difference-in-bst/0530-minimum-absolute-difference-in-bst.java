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
    public void traverse(TreeNode root, List<Integer> arr){
        if(root!=null){
            traverse(root.left,arr);
            arr.add(root.val);
            traverse(root.right,arr);
        }
        else{
            return;
        }
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        traverse(root,arr);
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            if((arr.get(i+1)-arr.get(i))<min){
                min=arr.get(i+1)-arr.get(i);
            }
        }
        return min;
    }
}