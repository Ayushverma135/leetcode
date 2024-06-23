class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double arr[]=new double[nums.length/2];
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(i<j){
            double temp=(double)(nums[i]+nums[j])/2;
            arr[k++]=temp;
            i++;
            j--;
        }
        Arrays.sort(arr);
        return arr[0];
    }
}