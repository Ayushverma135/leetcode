class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length-2;i++){
            if(arr[i+1]-arr[i]!=arr[i+2]-arr[i+1]){
                return false;
            }
        }
        return true;
    }
}