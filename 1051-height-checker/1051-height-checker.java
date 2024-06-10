class Solution {
    public int heightChecker(int[] heights) {
        int arr[]=new int[101];
        int expected[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            arr[heights[i]]++;
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                expected[j++]=i;
                arr[i]--;
            }
        }
        int count=0;
        for(int i=0;i<expected.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}