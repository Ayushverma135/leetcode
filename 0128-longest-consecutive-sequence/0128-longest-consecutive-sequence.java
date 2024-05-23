class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int max=0;
        int len=1;
        while(j<nums.length-1){
            if(nums[j]!=nums[j+1]){
                if(nums[j]+1==nums[j+1]){
                    len++;
                }
                else{
                    max=Math.max(max,len);
                    len=1;
                }
            }
            j++;
            
        }
        return Math.max(max,len);
    }
}