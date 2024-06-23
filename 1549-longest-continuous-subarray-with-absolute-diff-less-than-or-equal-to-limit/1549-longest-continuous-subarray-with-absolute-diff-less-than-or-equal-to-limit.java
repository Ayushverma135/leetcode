class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> min=new LinkedList<>();
        Deque<Integer> max=new LinkedList<>();
        int i=0;
        int res=0;
        for(int j=0;j<nums.length;j++){
            while(!max.isEmpty() && max.peekLast()<nums[j]){
                max.pollLast();
            }
            while(!min.isEmpty() && min.peekLast()>nums[j]){
                min.pollLast();
            }
            max.offerLast(nums[j]);
            min.offerLast(nums[j]);
            while(max.peekFirst()-min.peekFirst()>limit){
                if(max.peekFirst()==nums[i]){
                    max.pollFirst();
                }
                if(min.peekFirst()==nums[i]){
                    min.pollFirst();
                }
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}