class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int arr[]=new int[max+nums.length];
        for(int i:nums){
            arr[i]++;
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>1){
                int temp=arr[i]-1;
                arr[i+1]+=temp;
                arr[i]=1;
                count+=temp;
            }
        }
        return count;
    }
}