class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()
        );

        for (int key:map.keySet()) {
            queue.offer(new Pair<>(key,map.get(key)));
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.poll().getKey();
        }
        return result;
    }
}
