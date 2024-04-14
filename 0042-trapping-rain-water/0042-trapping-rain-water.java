class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int lmax=0;
        int rmax=0;
        int res=0;
        while(i<j){
            lmax=Math.max(height[i],lmax);
            rmax=Math.max(height[j],rmax);
            if(lmax<rmax){
                res+=lmax-height[i++];
            }
            else{
                res+=rmax-height[j--];
            }
        }
        return res;
    }
}