class Solution {
    public int findCenter(int[][] edges) {
        int x=edges[0][0];
        int y=edges[0][1];
        if(x==edges[1][0] ||x==edges[1][1]){
            return x;
        }
        if(y==edges[1][0] ||y==edges[1][1]){
            return y;
        }
        return -1;
    }
}