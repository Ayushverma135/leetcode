class Solution {
    public int minimumChairs(String s) {
        int maxchair=0;
        int curchair=0;
        for(char c:s.toCharArray()){
            if(c=='E'){
                curchair++;
            }
            if(c=='L'){
                curchair--;
            }
            maxchair=Math.max(maxchair,curchair);
        }
        return maxchair;
    }
}