class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length%3!=0){
            return new int[0][0];
        }
        int arr[][]=new int[nums.length/3][3];
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]<=k){
                arr[c][0]=nums[i];
                arr[c][1]=nums[i+1];
                arr[c][2]=nums[i+2];
                c++;
            }
            else{
                return new int[0][0];
            }
        }
        return arr;
    }
}