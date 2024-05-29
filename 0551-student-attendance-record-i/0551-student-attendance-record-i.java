class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){a++;}
            if(a>=2){return false;}
            if(s.charAt(i)=='L'){
                int j=i;
                int c=0;
                while(j<s.length() && s.charAt(i)==s.charAt(j)){
                    c++;
                    j++;
                }
                if(c>=3){return false;}
            }
        }
        return true;
    }
}