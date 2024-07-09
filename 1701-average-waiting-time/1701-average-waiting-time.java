class Solution {
    public double averageWaitingTime(int[][] customers) {
        int totalTime=customers[0][0]+customers[0][1];
        double ans=0;
        ans+=totalTime-customers[0][0];
        for(int i=1;i<customers.length;i++){
            if(totalTime>customers[i][0]){
                totalTime+=customers[i][1];
                ans+=totalTime-customers[i][0];
            }
            else{
                totalTime=customers[i][0]+customers[i][1];
                ans+=totalTime-customers[i][0];
            }
        }
        return ans/customers.length;
    }
}