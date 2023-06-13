class Solution {
    public int equalPairs(int[][] grid) {
        Map<ArrayList<Integer>,Integer> d= new HashMap<>();
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                arr.add(grid[i][j]);
            }
            if(d.containsKey(arr)){
                d.put(arr,d.get(arr)+1);
            }
            else{
                d.put(arr,1);
            }
        }
        int res=0;
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                arr.add(grid[j][i]);
            }
            if(d.containsKey(arr)){
                res+=d.get(arr);
            }
        }
        
        return res;
    }
}