class Solution {
    public int minOperations(int[] nums, int k) {
        int total=0;
        for(int i:nums){
            total^=i;
        }
        int x=0;
        while(total>0 || k>0){
            int a=total & 1;
            int b=k & 1;
            if(a != b){
                x++;
            }
            total=total>>1;
            k=k>>1;
        }
        return x;
    }
}