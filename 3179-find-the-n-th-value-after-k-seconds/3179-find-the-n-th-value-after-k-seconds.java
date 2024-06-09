class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int arr[]=new int[n];
        int m = 1000000007;
        for(int i=0;i<arr.length;i++){
            arr[i]=1;
        }
        while(k!=0){
            for(int i=1;i<n;i++){
                arr[i]=(arr[i]+arr[i-1])%m;
            }
            k--;
        }
        return arr[n-1];
    }
}