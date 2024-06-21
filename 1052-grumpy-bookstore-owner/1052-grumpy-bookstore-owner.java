class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans=0;
        int max=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){max+=customers[i];}
        }
        ans=Math.max(ans,max);
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1){max-=customers[i-minutes];}
            if(grumpy[i]==1){max+=customers[i];}
            ans=Math.max(ans,max);
        }
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){ans+=customers[i];}
        }
        return ans;
        
    }
}