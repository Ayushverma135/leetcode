class Solution {
    public boolean halvesAreAlike(String s) {
        String arr="aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        int v1=0;
        int v2=0;
        while(i<j){
            for(char k:arr.toCharArray()){
                if(k==s.charAt(i)){v1++;}
                if(k==s.charAt(j)){v2++;}
            }
            i++;
            j--;
        }
        return v1==v2;
    }
}