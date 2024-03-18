class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res=new ArrayList<>();
        int first=intervals[0][0];
        int last=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(last<intervals[i][0]){
                res.add(new int[]{first,last});
                first=intervals[i][0];
                last=intervals[i][1];
            }
            else{
                first=Math.min(first,intervals[i][0]);
                last=Math.max(last,intervals[i][1]);            }
        }
        res.add(new int[]{first,last});
        
        return res.toArray(new int[res.size()][]);
    }
}