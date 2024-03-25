class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0){
                return idx+1;
            }
            else{
                nums[idx]*=-1;
            }
        }
        return -1;
    }
}