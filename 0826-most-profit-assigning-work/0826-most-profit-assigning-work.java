class Solution2 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<profit.length;i++){
            q.offer(new int[]{profit[i],difficulty[i]});
        }
        Arrays.sort(worker);
        int count=0;
        int i=worker.length-1;
        while(!q.isEmpty() && i>=0){
            if(q.peek()[1]>worker[i]){
                q.poll();
            }
            else{
                count+=q.peek()[0];
                i--;
            }
        }
        return count;
    }
}
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
       int[][] arr=new int[difficulty.length][2];
       for(int i=0;i<difficulty.length;i++){
        arr[i][0]=difficulty[i];
        arr[i][1]=profit[i];
       }
       Arrays.sort(arr,(a,b)->a[0]-b[0]);
       for(int i=1;i<difficulty.length;i++){
        arr[i][1]=Math.max(arr[i][1],arr[i-1][1]);
       }
       int count=0;
       for(int i:worker){
        int j=0;
        int k=arr.length-1;
        int max=0;
        while(j<=k){
            int mid=j+(k-j)/2;
            if(arr[mid][0]<=i){
                max=Math.max(arr[mid][1],max);
                j=mid+1;
            }
            else{
                k=mid-1;
            }
        }
        count+=max;
       }
       return count;

    }
}