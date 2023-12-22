class Solution {
    public int maxScore(String s) {
        int ones=0;
        int zeroes=0;
        for(char i:s.toCharArray()){
            if(i=='0'){zeroes++;}
            if(i=='1'){ones++;}
        }
        int x=0;
        int res=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                x++;
                res=Math.max(res,x+ones);
            }
            else{
                ones--;
                res=Math.max(res,x+ones);
            }
        }
        return res;
    }
}