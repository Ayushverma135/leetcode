class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int res[]=new int[points.length];
        for(int i=0;i<points.length;i++){
            res[i]=points[i][0];
        }
        Arrays.sort(res);
        int ans=0;
        for(int i=0;i<res.length-1;i++){
            if(res[i+1]-res[i]>ans){
                ans=res[i+1]-res[i];
            }
        }
        return ans;
    }
}