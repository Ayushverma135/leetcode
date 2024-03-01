class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int rows[]=new int[n];
        int cols[]=new int[n];
        for(int i=0;i<n;i++){
            int m1=-1;
            int m2=-1;
            for(int j=0;j<n;j++){
                if(grid[i][j]>m1){m1=grid[i][j];}
                if(grid[j][i]>m2){m2=grid[j][i];}
            }
            rows[i]=m1;
            cols[i]=m2;
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res+=Math.abs(grid[i][j]-Math.min(rows[i],cols[j]));
            }
        }
        return res;
    }
}