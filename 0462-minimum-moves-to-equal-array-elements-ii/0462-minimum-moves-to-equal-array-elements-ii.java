class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=0;
        if(nums.length%2==0){
            mid=(nums.length/2)-1;
        }
        else{
            mid=nums.length/2;
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=Math.abs(nums[i]-nums[mid]);
        }
        return c;
    }
}