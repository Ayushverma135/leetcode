class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(d.containsKey(nums[i])){
                d.put(nums[i],d.get(nums[i])+1);
            }
            else{
                d.put(nums[i],1);
            }
        }
        int n=0;
        for(int i : d.keySet()){
            n=Math.max(n,d.get(i));
        }
        for(int i=0;i<n;i++){
            List<Integer> lst=new ArrayList<>();
            arr.add(lst);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<n;j++){
                if(!arr.get(j).contains(nums[i])){
                    arr.get(j).add(nums[i]);
                    break;
                }
            }
        }
        return arr;
    }
}