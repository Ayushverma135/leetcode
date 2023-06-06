class Solution {
    public int arrangeCoins(int n) {
        long l=1;
        long r=n;
        while(l<=r){
            long mid=(l+r)/2;
            long x=(mid*(mid+1))/2;
            if(x==n){
                return (int)mid;
            }
            else if(x<n){
                
                l=mid+1;
                
            }
            else{
            
                r=mid-1;
            }
        }
        return (int)r;
    }
}