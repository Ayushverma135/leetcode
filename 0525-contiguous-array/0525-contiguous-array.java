class Solution {
    public int findMaxLength(int[] nums) {
        int arr[]=new int[2*nums.length+1];
        Arrays.fill(arr,-2);
        arr[nums.length]=-1;
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){sum--;}
            else{sum++;}
            if(arr[sum+nums.length]>=-1){
                res=Math.max(res,i-arr[sum+nums.length]);
            }
            else{
                arr[sum+nums.length]=i;
            }
        }
        return res;
    }
}