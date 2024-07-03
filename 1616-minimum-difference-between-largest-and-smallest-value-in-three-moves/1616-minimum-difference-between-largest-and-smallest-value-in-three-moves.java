class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-3-1;
        int min=Integer.MAX_VALUE;
        while(i<4 && j<nums.length){
            min=Math.min(min,nums[j]-nums[i]);
            i++;
            j++;
        }
        return min;
    }
}