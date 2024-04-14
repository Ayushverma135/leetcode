class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int res=0;
        while(i<j){
            int minh=Math.min(height[i],height[j]);
            res=Math.max(res,minh*(j-i));
            while(i<j && height[i]<=minh) i++;
            while(i<j && height[j]<=minh) j--;
        }
        return res;
    }
}