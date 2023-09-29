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
    public void current(TreeNode root,int level,List<Integer> arr){
        if(root==null){
            return;
        }
        if(level==1){
            arr.add(root.val);
        }
        else if(level>1){
            current(root.left,level-1,arr);
            current(root.right,level-1,arr);
        }
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=1+height(root.left);
        int r=1+height(root.right);
        return Math.max(l,r);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<height(root);i++){
            List<Integer> arr= new ArrayList<>();
            current(root,i+1,arr);
            res.add(arr);
        }
        for(int i=1;i<res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
}