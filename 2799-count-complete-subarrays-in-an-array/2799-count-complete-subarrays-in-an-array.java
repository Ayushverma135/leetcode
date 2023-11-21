class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> d1=new HashMap<>();
        HashMap<Integer,Integer> d2=new HashMap<>();
        for(int i:nums){
            if(d1.containsKey(i)){
                d1.put(i,d1.get(i)+1);
            }
            else{
                d1.put(i,1);
            }
        }
        int j=0;
        int i=0;
        int res=0;
        while(j<nums.length){
            if(d2.containsKey(nums[j])){
                d2.put(nums[j],d2.get(nums[j])+1);
            }
            else{
                d2.put(nums[j],1);
            }
            if(d2.size()<d1.size()){
                j++;
            }
            else{
                res+=nums.length-j;
                while(d1.size()==d2.size()){
                    d2.put(nums[i],d2.get(nums[i])-1);
                    if(d2.get(nums[i])==0){
                        d2.remove(nums[i]);
                    }
                    if(d2.size()==d1.size()){
                        res+=nums.length-j;
                    }
                    i++;
                }
                j++;
            }
        }
        return res;
    }
}