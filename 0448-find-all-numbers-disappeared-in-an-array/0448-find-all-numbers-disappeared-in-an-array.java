class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]-1]<0){
                continue;
            }
            arr[nums[i]-1]*=-1;
        }
        for(int i:arr){
            if(i>0){
                res.add(i);
            }
        }
        return res;
    }
}