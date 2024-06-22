class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int arr[]=new int[nums.length+1];
        arr[0]=1;
        int sum=0;
        int count=0;
        for(int i:nums){
            sum+=i%2;
            if(sum-k>=0){
                count+=arr[sum-k];
            }
            arr[sum]++;
        }
        return count;
    }
}