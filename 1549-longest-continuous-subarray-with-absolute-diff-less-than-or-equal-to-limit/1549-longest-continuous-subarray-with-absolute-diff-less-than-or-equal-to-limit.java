class Solution {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> min=new PriorityQueue<>();
        PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        int i=0;
        int j=0;
        while(j<nums.length){
            min.offer(nums[j]);
            max.offer(nums[j]);
            while(max.peek()-min.peek()>limit){
                min.remove(nums[i]);
                max.remove(nums[i]);
                i++;
            }
            ans=Math.max(j-i+1,ans);
            j++;
        }
        return ans;
    }
}