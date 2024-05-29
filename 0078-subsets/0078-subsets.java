class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        traverse(nums,new ArrayList<>(),res,nums.length-1);
        return res;
    }
    public void traverse(int[] nums, List<Integer> subset,List<List<Integer>> res,int i){
        if(i<0){
            res.add(new ArrayList<>(subset));
            return;
        }
        else{
            int ele=nums[i];
            traverse(nums,subset,res,i-1);
            subset.add(ele);
            traverse(nums,subset,res,i-1);
            subset.remove(subset.size()-1);
        }
        
    }
}