class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int pens=total/cost1;
        int pencil=total/cost2;
        long ans=0;
        for(int i=0;i<=pens;i++){
            ans+=(long)((total-cost1*i)/cost2+1);
        }
        return ans;
    }
}