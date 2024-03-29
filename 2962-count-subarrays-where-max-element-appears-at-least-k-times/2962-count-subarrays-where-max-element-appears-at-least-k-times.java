class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=-1;
        for(int i:nums){
            if(i>max){max=i;}
        }
        int c=0;
        for(int i:nums){
            if(i==max){
                c++;
            }
        }
        if(c<k){return 0;}
        int i=0;
        int j=0;
        c=0;
        long res=0;
        while(j<nums.length){
            if(nums[j]==max){
                c++;
            }
            while(c>=k){
                res+=nums.length-j;
                if(nums[i]==max){
                    c--;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}