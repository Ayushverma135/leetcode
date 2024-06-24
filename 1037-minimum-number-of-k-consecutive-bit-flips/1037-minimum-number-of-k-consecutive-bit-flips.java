class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count=0;
        int flip=0;
        boolean arr[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i>=k && arr[i-k]==true){
                flip--;
            }
            if(flip%2==nums[i]){
                if(i+k>nums.length){
                    return -1;
                }
                count++;
                flip++;
                arr[i]=true;
            }
        }
        return count;
    }
}