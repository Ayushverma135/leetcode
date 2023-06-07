class Solution {
    public int minFlips(int a, int b, int c) {
        int x=0;
        while(a!=0 || b!=0 || c!=0){
            int A=a&1;
            int B=b&1;
            int C=c&1;
            if((A|B)!=C){
                if(C==0){
                    if(A==1 && B==1){
                        x+=2;
                    }
                    else if(A==1 || B==1){
                        x++;
                    }
                }
                else{
                    if(A==0 && B==0){
                        x++;
                    }
                    
                }
                
                
            }
            a=a>>1;
            b=b>>1;
            c=c>>1;
        }
        return x;
    }
}