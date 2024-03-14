class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> d=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i:nums){
            sum+=i;
            if(sum==k){count++;}
            if(d.containsKey(sum-k)){
                count+=d.get(sum-k);
            }
            if(d.containsKey(sum)){
                d.put(sum,d.get(sum)+1);
            }
            else{
                d.put(sum,1);
            }
        }
        return count;
    }
}