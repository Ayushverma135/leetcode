class Solution {
    public long countSubstrings(String s, char c) {
        long z=0;
        for(char i:s.toCharArray()){
            if(i==c){z++;}
        }
        if(z==0){return 0;}
        long n=s.length();
        return (long)(z*(z+1)/2);    
    }
}