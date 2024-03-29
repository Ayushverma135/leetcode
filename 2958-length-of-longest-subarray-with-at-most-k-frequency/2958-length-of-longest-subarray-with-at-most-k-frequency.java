class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max){max=i;}
            if(i<min){min=i;}
        }
        int arr[]=new int[max-min+1];
        int len=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            arr[nums[j]-min]++;
            while(arr[nums[j]-min]>k){
                arr[nums[i]-min]--;
                i++;  
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;

    }
}