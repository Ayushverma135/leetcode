class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int res[]=new int[1001];
        for(int i:arr1){
            res[i]++;
        }
        int ans[]=new int[arr1.length];
        int j=0;
        for(int i:arr2){
            while(res[i]>0){
                ans[j++]=i;
                res[i]--;
            }
        }
        for(int i=0;i<res.length;i++){
            while(res[i]>0){
                ans[j++]=i;
                res[i]--;
            }
        }
        return ans;
    }
}