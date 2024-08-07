class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        int res=0;
        for(int i=left-1;i<right;i++){
            res+=arr.get(i);
            res%=1000000007;
        }
        return res;
    }
}