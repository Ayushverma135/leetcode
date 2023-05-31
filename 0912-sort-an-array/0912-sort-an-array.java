class Solution {
    public static void counting(int[] array,int size){
        
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }
        int count[]=new int[max-min+1];
        int output[]=new int[size];
        for (int i = 0; i < size; i++) {
            count[array[i]-min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = size - 1; i >= 0; i--) {
            output[--count[array[i]-min]] = array[i];
        }
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }
    public int[] sortArray(int[] nums) {
        counting(nums,nums.length);
        return nums;
    }
}