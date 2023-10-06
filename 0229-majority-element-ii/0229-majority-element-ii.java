class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(d.containsKey(nums[i])){
                d.put(nums[i],d.get(nums[i])+1);
            }
            else{
                d.put(nums[i],1);
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i:d.keySet()){
            if(d.get(i)>(int)(nums.length/3)){
                res.add(i);
            }
        }
        return res;
    }
}