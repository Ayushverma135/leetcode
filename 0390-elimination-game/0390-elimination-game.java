class Solution {
    public int lastRemaining(int n) {
        boolean left=true;
        int head=1,diff=1;
        while(n>1){
            if(left || n%2!=0){
                head+=diff;
            }
            n/=2;
            diff*=2;
            left=!left;
        }
        return head;
    }
}