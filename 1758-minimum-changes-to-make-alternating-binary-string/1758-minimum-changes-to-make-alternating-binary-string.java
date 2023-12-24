class Solution {
    public int minOperations(String s) {
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    c1++;
                }
                else{
                    c2++;
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    c1++;
                }
                else{
                    c2++;
                }
            }
        }
        return Math.min(c1,c2);
    }
}