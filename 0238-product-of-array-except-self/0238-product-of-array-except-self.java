class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int czero=0;
        for(int i:nums){
            if(i==0){
                czero++;
            }
            else{
                pro*=i;
            }
        }
        if(czero>1){
            int arr[]=new int[nums.length];
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            if(czero!=0){
                if(nums[i]==0){
                    nums[i]=pro;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=pro/nums[i];
            }
        }
        return nums;
    }
}