class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int avg=0;
        for(int i=0;i<k;i++){
            avg+=arr[i];
        }
        if((int)avg/k>=threshold){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            avg+=arr[i];
            avg-=arr[i-k];
            if((int)avg/k>=threshold){
                count++;
            }
        }
        return count;
    }
}