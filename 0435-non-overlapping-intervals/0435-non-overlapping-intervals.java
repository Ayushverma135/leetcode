class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1],b[1]));
        int c=0;
        int res=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(res>intervals[i][0]){
                c++;
            }
            else{
                res=intervals[i][1];
            }
        }
        return c;
    }
}