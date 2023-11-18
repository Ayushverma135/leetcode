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
    public void traverse(TreeNode root,ArrayList<TreeNode> arr){
        if(root==null){
            return;
        }
        traverse(root.left,arr);
        arr.add(root);
        traverse(root.right,arr);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        traverse(root,arr);
        int n=arr.size();
        int i=0;
        int j=n-1;
        TreeNode v1=null;
        TreeNode v2=null;
        while(i<n){
            if(arr.get(i).val>arr.get(i+1).val){
                v1=arr.get(i);
                break;
            }
            i++;  
        }
        while(j>0){
            if(arr.get(j).val<arr.get(j-1).val){
                v2=arr.get(j);
                break;
            }
            j--;  
        }
        int temp=v1.val;
        v1.val=v2.val;
        v2.val=temp;
    }
}