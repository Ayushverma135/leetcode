/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void traverse(Node root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        for(int i=0;i<root.children.size();i++){
            traverse(root.children.get(i),res);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> res=new ArrayList<>();
        traverse(root,res);
        return res;
    }
}