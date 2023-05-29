class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s=0,i=0,t=k;
        while(i!=k){
            s+=nums[i];
            i++;
            
        }
        int m=s;
        for(i=0;i<nums.length-k;i++){
            s+=nums[k+i]-nums[i];
            if(s>m){
                m=s;
            }
        }
        return (double)m/k;
    }
}