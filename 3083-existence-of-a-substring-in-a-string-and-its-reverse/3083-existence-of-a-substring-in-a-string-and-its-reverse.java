class Solution {
    public boolean isSubstringPresent(String s) {
        String r="";
        for(int k=s.length()-1;k>=0;k--){
            r+=s.charAt(k);
        }
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(i)==r.charAt(j) && s.charAt(i+1)==r.charAt(j+1)){
                    return true;
                }
            }
        }
        return false;
    }
}