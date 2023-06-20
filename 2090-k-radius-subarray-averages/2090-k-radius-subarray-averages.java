class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]= new int[nums.length];
            for(int i=0;i<nums.length;i++){
                arr[i]=-1;
            }
        if(k>=nums.length || (2*k+1)>nums.length){
            return arr;
        }
        long sum=0;
        for(int i=0;i<2*k+1;i++){
            sum+=nums[i];
        }
        arr[k]=(int)(sum/(2*k+1));
        for(int i=k+1;i<nums.length-k;i++){
            sum+=nums[i+k];
            sum-=nums[i-k-1];
            arr[i]=(int)(sum/(2*k+1));
            
        }
        return arr;
    }
}