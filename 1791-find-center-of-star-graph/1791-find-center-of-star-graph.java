class Solution1 {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            if(map.containsKey(edges[i][0])){
                map.put(edges[i][0],map.get(edges[i][0])+1);
            }
            else{
                map.put(edges[i][0],1);
            }

            if(map.containsKey(edges[i][1])){
                map.put(edges[i][1],map.get(edges[i][1])+1);
            }
            else{
                map.put(edges[i][1],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==edges.length){
                return key;
            }
        }
        return -1;
    }
}
class Solution2 {
    public int findCenter(int[][] edges) {
        int max=0;
        for(int[] i:edges){
            max=Math.max(max,Math.max(i[0],i[1]));
        }
        int arr[]=new int[max+1];
        for(int[] i:edges){
            arr[i[0]]++;
            arr[i[1]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max-1){
                return i;
            }
        }
        return -1;
    }
}
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