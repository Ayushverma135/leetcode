class Solution {
    public List<Integer> intersection(int[][] nums) {
        int n=1001;
        int c=0;
        int arr[]=new int[n];
        for(int i:nums[0]){
            arr[i]=1;
        }
        for(int i=1;i<nums.length;i++){
            for(int j:nums[i]){
                if(arr[j]==i){
                    arr[j]=i+1;
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums.length){
                res.add(i);
            }
        }
        return res;
    }
}