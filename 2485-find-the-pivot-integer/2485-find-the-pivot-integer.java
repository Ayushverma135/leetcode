class Solution {
    public int pivotInteger(int n) {
        int sum=n*(n+1)/2;
        int c=0;
        for(int i=1;i<=n;i++){
            c+=i;
            if(sum==c){return i;}
            sum-=i;
        }
        return -1;
    }
}