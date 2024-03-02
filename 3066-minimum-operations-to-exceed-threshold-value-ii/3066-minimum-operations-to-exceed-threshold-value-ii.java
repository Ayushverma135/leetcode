class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> q = new PriorityQueue<>();
        for (int num : nums) {
            q.add((long)num);
        }
        int res = 0;
        while (q.size()>=2) {
            if (q.peek()>=k) {
                return res;
            }
            long x = q.poll();
            long y = q.poll();
            q.add((long)(Math.min(x, y) * 2 + Math.max(x, y)));
            res++;  
        }
        return res;
    }
}