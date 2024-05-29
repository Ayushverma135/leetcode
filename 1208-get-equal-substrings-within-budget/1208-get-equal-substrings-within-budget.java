class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int temp=0;
        int i=0;
        int j=0;
        int len=0;
        while(j<s.length()){
            temp+=Math.abs(s.charAt(j)-t.charAt(j));
            while(temp>maxCost){
                temp-=Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}