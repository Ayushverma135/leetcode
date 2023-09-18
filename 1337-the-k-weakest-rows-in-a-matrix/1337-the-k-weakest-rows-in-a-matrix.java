class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr[][]=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=0){
                    c++;
                }
            }
            arr[i][0]=c;
            arr[i][1]=i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i][1];
        }
        return res;
    }
}