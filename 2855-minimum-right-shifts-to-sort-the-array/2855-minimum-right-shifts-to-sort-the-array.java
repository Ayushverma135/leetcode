class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int k=0;
        int count=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)>nums.get(i+1)){
                k=i+1;
                count++;
            }
        }
        if(count>1){return -1;}
        if(k==0){return 0;}
        return nums.get(0)>nums.get(nums.size()-1)? nums.size()-k:-1;
    }
}