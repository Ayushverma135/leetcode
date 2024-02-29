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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            int n=q.size();
            int prev=lvl%2==0? Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                TreeNode temp=q.remove();
                if(lvl%2==0){
                    if(temp.val%2==0){return false;}
                    if(prev>=temp.val){return false;}
                }
                else{
                    if(temp.val%2!=0){return false;}
                    if(prev<=temp.val){return false;}
                }
                prev=temp.val;
                if(temp.left!=null){q.add(temp.left);}
                if(temp.right!=null){q.add(temp.right);}
            }
            lvl++;
        }
        return true;
    }
}