class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> s=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1){
                i++;
            }
            if(x!=nums[i]){
                String r=x+"->"+nums[i];
                s.add(r);
            }
            else{
                String r=Integer.toString(nums[i]);
                s.add(r);
            }
        }
        return s;
    }
}