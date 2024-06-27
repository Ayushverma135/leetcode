class Solution {
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