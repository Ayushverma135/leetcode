class Solution {
    public int findMaxK(int[] nums) {
        int arr[]=new int[1001];
        for(int i:nums){
            if(i<0){
                arr[-i]++;
            }
        }
        int ans=-1;
        for(int i:nums){
            if(i>0 && arr[i]>0){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}