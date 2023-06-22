class Solution {
    public long minCost(int[] nums, int[] cost) {
        int arr[][]= new int[nums.length][2];
        long sum=0;
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
            sum+=cost[i];
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        long m=(sum+1)/2;
        long cur=0;
        long mid=-1;
        for(int i=0;i<nums.length;i++){
            cur+=arr[i][1];
            if(cur>=m){
                mid=arr[i][0];
                break;
            }
        }
        long c=0;
        for(int i=0;i<nums.length;i++){
            c+=Math.abs((long)mid-(long)nums[i])*(long)cost[i];
        }
        return c;
    }
}