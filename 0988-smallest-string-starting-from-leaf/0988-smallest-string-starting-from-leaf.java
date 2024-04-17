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
    ArrayList<String> res=new ArrayList<>();
    public void traverse(TreeNode root, String cur){
        if(root==null){
            return ;
        }
        cur=(char)(root.val+'a')+cur;
        if(root.left==null && root.right==null){
            res.add(cur);
            return;
        }
        traverse(root.left,cur);
        traverse(root.right,cur);
    }
    public String smallestFromLeaf(TreeNode root) {
        traverse(root,"");
        Collections.sort(res);
        return res.get(0);
    }
}