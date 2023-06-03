class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target){
                break;
            }
            else if(matrix[mid][0]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        int i=0;
        int j=matrix[mid].length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(matrix[mid][m]==target){
                return true;
            }
            else if(matrix[mid][m]<target){
                i=m+1;
            }
            else{
                j=m-1;
            }
        }
        return false;


    }
}