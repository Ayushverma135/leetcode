class Solution {
    public int reverse(int n){
        int sum=0;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum;
    }
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> d=new HashMap<>();
        long res=0;
        int m=1000000007;
        for(int i=nums.length-1;i>=0;i--){
            int x=nums[i]-reverse(nums[i]);
            if(d.containsKey(x)){
                res+=d.get(x);
                d.put(x,d.get(x)+1);
            }
            else{
                d.put(x,1);
            }
        }
        res=res%m;
        return (int)res;
    }
}