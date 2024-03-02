class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>=0){
                break;
            }
        }
        int j=i-1;
        int arr[] = new int[nums.length];
        int k=0;
        while(i<nums.length && j>=0){
            if(nums[i]*nums[i]<=nums[j]*nums[j]){
                arr[k]=nums[i]*nums[i];
                i++;
            }
            else{
                arr[k]=nums[j]*nums[j];
                j--;
            }
            k++;
        }
        while(i<nums.length){
            arr[k]=nums[i]*nums[i];
            i++;
            k++;
        }
        while(j>=0){
            arr[k]=nums[j]*nums[j];
            j--;
            k++;
        }
        return arr;
    }
}