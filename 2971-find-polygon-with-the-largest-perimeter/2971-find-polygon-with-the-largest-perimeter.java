class Solution {
    public long largestPerimeter(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=nums.length-1;i>=0;i--){
            sum-=nums[i];
            if(sum>nums[i]){
                return sum+nums[i];
            }
        }
        return -1;
    }
}