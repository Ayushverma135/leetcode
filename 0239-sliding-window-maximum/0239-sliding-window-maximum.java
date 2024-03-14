class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        int res[]=new int[nums.length-k+1]; 
        for(int i=0;i<k;i++){
            pq.offer(new Pair(nums[i],i));
        }
        res[0]=pq.peek().getKey();
        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek().getValue()<=i-k){
                pq.remove();
            }
            pq.offer(new Pair(nums[i],i));
            res[i-k+1]=pq.peek().getKey();
        }
        return res;
    }
}