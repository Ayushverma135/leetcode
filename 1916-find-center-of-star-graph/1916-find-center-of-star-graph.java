class Solution {
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