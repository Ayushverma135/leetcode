class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int max=0;
        int ans=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
                max=0;
            }
            while(odd==k){
                max++;
                if(i<nums.length && nums[i]%2!=0){
                    odd--;
                }
                i++;
            }
            ans+=max;
            j++;
        }
        return ans;
    }
}