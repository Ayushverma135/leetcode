class Solution {
    public int numberOfChild(int n, int k) {
        if(k<n){
            return k;
        }
        int f=0;
        while(k-(n-1)>0){
            if(f==0){f=1;}
            else{f=0;}
            k-=(n-1);
        }
        if(f==0){
            return k;
        }
        return n-k-1;
    }
}