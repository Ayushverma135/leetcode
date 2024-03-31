class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minpos=-1;
        int maxpos=-1;
        int out=-1;
        long res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK){
                out=i;
            }
            if(nums[i]==minK){
                minpos=i;
            }
            if(nums[i]==maxK){
                maxpos=i;
            }
            int temp=Math.min(minpos,maxpos)-out;
            res+=temp<=0?0:temp;
        }
        return res;
    }
}