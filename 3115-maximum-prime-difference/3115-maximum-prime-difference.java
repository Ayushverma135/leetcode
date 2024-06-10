class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean arr[]=new boolean[101];
        arr[1]=true;
        for(int i=2;i*i<101;i++){
            if(!arr[i]){
                for(int j=i*i;j<101;j+=i){
                    arr[j]=true;
                }
            }
        }
        int i=0;
        int j=nums.length-1;
        while(arr[nums[i]]!=false){
            i++;
        }
        while(arr[nums[j]]!=false){
            j--;
        }
        return Math.abs(j-i);
    }
}