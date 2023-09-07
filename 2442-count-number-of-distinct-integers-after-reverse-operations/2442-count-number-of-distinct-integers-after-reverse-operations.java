class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int res=0;
            while(n!=0){
                res=res*10+n%10;
                n/=10;
            }
            set.add(res);
            set.add(nums[i]);
        }
        return set.size();
        
    }
}