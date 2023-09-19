class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int Row[] =new int[grid.length];
        int Col[] = new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int z=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    z++;
                }
            }
            Row[i]=z;
        }
        for(int i=0;i<grid[0].length;i++){
            int z=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0){
                    z++;
                }
            }
            Col[i]=z;
        }
        int diff[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                diff[i][j]=(grid.length-Row[i])+(grid[0].length-Col[j])-Row[i]-Col[j];
            }
        }
        return diff;
    }
}