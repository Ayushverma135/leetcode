class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int i=0;
        int j=0;
        int sum=0;
        int count=0;
        int zeroes=0;
        while(j<nums.length){
            sum+=nums[j];
            while(i<j && (nums[i]==0 || sum>goal)){
                if(nums[i]==0){
                    zeroes++;
                }
                else{
                    zeroes=0;
                }
                sum-=nums[i];
                i++;
            }
            if(sum==goal){
                count+=1+zeroes;
            }
            j++;
        }
        return count;
    }
}