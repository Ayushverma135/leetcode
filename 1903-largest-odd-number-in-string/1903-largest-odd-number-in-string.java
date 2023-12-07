class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            int ch=num.charAt(i)-'0';
            if(ch%2!=0){return num.substring(0,i+1);}
            i--;
        }
        return "";
    }
}