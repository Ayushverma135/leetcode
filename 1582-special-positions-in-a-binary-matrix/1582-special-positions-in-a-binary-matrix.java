class Solution {
    public int numSpecial(int[][] mat) {
        int c=0;
        int row[]=new int[mat.length];
        int col[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(mat[i][j]==1 && row[i]==1 && col[j]==1){
                    c++;
                }
            }
        }
        return c;
    }
}