class Solution {
    public int minimumArea(int[][] grid) {
        int left1=Integer.MAX_VALUE;
        int right1=Integer.MIN_VALUE;
        
        int left2=Integer.MAX_VALUE;
        int right2=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    left1=Math.min(left1,j);
                    right1=Math.max(right1,j);
                    
                    left2=Math.min(left2,i);
                    right2=Math.max(right2,i);
                }
            }
        }
        return (right1-left1+1)*(right2-left2+1);
    }
}