class Solution {
    public int maxProduct(int[] nums) {
        int pro=Integer.MIN_VALUE;
        double temp=1;
        for(int i:nums){
            temp*=(double)i;
            pro=(int)Math.max(pro,temp);
            if(temp==0){
                temp=1;
            }
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            temp*=(double)nums[i];
            pro=(int)Math.max(pro,temp);
            if(temp==0){
                temp=1;
            }
        }
        return pro;
    }
}