class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){return 0;}
        int i=0;
        int j=0;
        int ans=0;
        int res=1;
        while(j<nums.length){
            res*=nums[j];
            while(res>=k){
                res/=nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}