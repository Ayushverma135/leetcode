class Solution {
    public int solve(int[][] img,int i,int j){
        int c=0;
        int sum=0;
        int m=img.length;
        int n=img[0].length;
        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = j - 1; y <= j + 1; y++) {
                if (0 <= x && x < m && 0 <= y && y < n) {
                    sum += img[x][y];
                    c += 1;
                }
            }
        }
        return sum/c;
    }
    public int[][] imageSmoother(int[][] img) {
        int res[][]=new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[i].length;j++){
                res[i][j]=solve(img,i,j);
            }
        }
        return res;
    }
}