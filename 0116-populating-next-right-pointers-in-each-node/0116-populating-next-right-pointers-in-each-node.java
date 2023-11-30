/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<>();
        List<List<Node>> res=new ArrayList<>();
        if(root==null){
            return null;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Node> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                arr.add(q.remove());
            }
            res.add(arr);
        }
        int j;
        for(int i=0;i<res.size();i++){
            if(res.get(i).size()==1){
                res.get(i).get(0).next=null;
            }
            else{
                for(j=0;j<res.get(i).size()-1;j++){
                    res.get(i).get(j).next=res.get(i).get(j+1);
                }
                res.get(i).get(j).next=null;
            }  
        }
        return root;
    }
}