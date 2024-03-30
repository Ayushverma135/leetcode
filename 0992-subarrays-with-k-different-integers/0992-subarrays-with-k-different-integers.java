class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int i=0;
        int j=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            res+=j-i+1;
            j++;
        }
        i=0;
        j=0;
        int res2=0;
        map.clear();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k-1){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            res2+=j-i+1;
            j++;
        }
        return res-res2;
    }
}