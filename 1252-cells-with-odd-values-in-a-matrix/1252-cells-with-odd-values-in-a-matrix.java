class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<indices.length;i++){
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        int c=0;
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if((row[i]+col[j])%2!=0){
                    c++;
                }
            }
        }
        return c;
    }
}