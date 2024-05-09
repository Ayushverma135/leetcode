class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int j=0;
        for(int i=happiness.length-1;i>=0;i--){
            if(k==0 || happiness[i]-j<=0){
                break;
            }
            sum+=happiness[i]-j;
            j++;
            k--;
        }
        return sum;
    }
}