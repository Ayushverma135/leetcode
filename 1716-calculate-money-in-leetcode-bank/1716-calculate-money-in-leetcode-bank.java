class Solution {
    public int totalMoney(int n) {
        if(n<7){
            return n*(n+1)/2;
        }
        int res=0;
        int i;
        for(i=0;i<n/7;i++){
            res+=((7+i)*(7+i+1)/2)-(i*(i+1)/2);
        }
        for(int j=i+1;j<n%7+i+1;j++){
            res+=j;
        }
        return res;

    }
}