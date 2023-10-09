class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==target){
                arr[0]=m;
                j=m-1;
            }
            else if(nums[m]>target){
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        i=0;
        j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]==target){
                arr[1]=m;
                i=m+1;
            }
            else if(nums[m]>target){
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return arr;
    }
}