class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> d=new HashMap<>();
        int sum=0;
        int count=0;
        int rem=0;
        for(int i:nums){
            sum+=i;
            rem=sum%k;
            if(rem==0){count++;}
            if(rem<0){
                rem+=k;
            }
            if(d.containsKey(rem)){
                count+=d.get(rem);
                d.put(rem,d.get(rem)+1);
            }
            else{
                d.put(rem,1);
            }
        }
        return count;
    }
}