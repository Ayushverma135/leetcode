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
    public void traverse(TreeNode root, HashSet<Integer> to_delete, List<TreeNode> arr, boolean isRoot){
        if (root == null) {
            return;
        }

        boolean deleted = to_delete.contains(root.val);
        if (isRoot && !deleted) {
            arr.add(root);
        }
        if (root.left != null) {
            traverse(root.left, to_delete, arr, deleted);
            if (to_delete.contains(root.left.val)) {
                root.left = null;
            }
        }
        if (root.right != null) {
            traverse(root.right, to_delete, arr, deleted);
            if (to_delete.contains(root.right.val)) {
                root.right = null;
            }
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : to_delete) {
            set.add(i);
        }
        traverse(root, set, arr,true);
        return arr;
    }
}