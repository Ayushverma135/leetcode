class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int k=0;k<32;k++){
            int temp=1<<k;
            int zeroes=0;
            int ones=0;
            for(int i:nums){
                if((i & temp)==0){
                    zeroes++;
                }
                else{
                    ones++;
                }
            }
            if(ones%3!=0){
                result=result|temp;
            }
        }
        return result;
    }
}