class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(d.containsKey(nums[i])){
                if(Math.abs(d.get(nums[i])-i)<=k){
                    return true;
                }
                else{
                    d.put(nums[i],i);
                }
                
            }
            else{
                d.put(nums[i],i);
            }
        }
        return false;
    }
}