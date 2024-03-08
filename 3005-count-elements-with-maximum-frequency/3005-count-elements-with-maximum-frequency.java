class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int arr[]=new int[max+1];
        for(int i:nums){
            arr[i]++;
        }
        max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        int count=0;
        for(int i:arr){
            if(i==max){
                count++;
            }
        }
        return count*max;
    }
}