class Solution {
    public String largestGoodInteger(String num) {
        int max=-1;
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                String s=""+num.charAt(i)+num.charAt(i+1)+num.charAt(i+1);
                int val = Integer.parseInt(s);
                if(val>max){
                    max=val;
                }
            }
        }
        if(max==-1){
            return "";
        }
        if(max==0){
            return max+"00";
        }
        return Integer.toString(max);
    }
}