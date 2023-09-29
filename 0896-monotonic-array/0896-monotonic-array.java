class Solution {
    public boolean isMonotonic(int[] nums) {
        int f=0;
        int c=0;
        boolean dcx=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                f=1;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c=1;
                break;
            }
        }
        if(f==0 || c==0)
            return true;
        return false;
    }
}