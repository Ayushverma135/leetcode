class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mindx=-1;
        int maxdx=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxdx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                mindx=i;
            }
        }
        int x=Math.max(mindx,maxdx)+1;
        int y=Math.max(nums.length-mindx,nums.length-maxdx);
        int z=0;
        if(mindx<maxdx){
            z=mindx+1+nums.length-maxdx;
        }
        else{
            z=maxdx+1+nums.length-mindx;
        }
        return Math.min(Math.min(x,y),z);
    }
}