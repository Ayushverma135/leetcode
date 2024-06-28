class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int degree[]=new int[n];
        for(int i[]:roads){
            degree[i[0]]++;
            degree[i[1]]++;
        }
        Arrays.sort(degree);
        long count=1;
        long ans=0;
        for(int i:degree){
            ans+=count*i;
            count++;
        }
        return ans;
    }
}