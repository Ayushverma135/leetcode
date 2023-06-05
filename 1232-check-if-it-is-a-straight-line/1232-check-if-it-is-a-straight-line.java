class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int X=(coordinates[1][1]-coordinates[0][1]);
        int Y=(coordinates[1][0]-coordinates[0][0]);
        for(int i=1;i<coordinates.length;i++){
            int x=(coordinates[i][1]-coordinates[i-1][1]);
            int y=(coordinates[i][0]-coordinates[i-1][0]);
            if(Y*x!=X*y){
                return false;
            }
        }
        return true;
    }
}