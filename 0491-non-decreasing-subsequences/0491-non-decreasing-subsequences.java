class Solution {
    public void traverse(Set<List<Integer>> res, List<Integer> arr, int[] nums, int i){
        if(i==nums.length){
            if(arr.size()>1){
                res.add(new ArrayList<>(arr));
            }
            return;
        }
        if(arr.size()==0 || nums[i]>=arr.get(arr.size()-1)){
            arr.add(nums[i]);
            traverse(res,arr,nums,i+1);
            arr.remove(arr.size()-1);
        }
        traverse(res,arr,nums,i+1);
        
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        List<Integer> arr=new ArrayList<>();
        traverse(res,arr,nums,0);
        return new ArrayList<>(res);
    }
}