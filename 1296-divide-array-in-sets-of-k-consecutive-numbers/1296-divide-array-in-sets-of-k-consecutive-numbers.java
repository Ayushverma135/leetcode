class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) {
            return false;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != 0) {
                for (int j = 0; j < k; j++) {
                    if (map.getOrDefault(nums[i] + j, 0) == 0) {
                        return false;
                    }
                    map.put(nums[i] + j, map.get(nums[i] + j) - 1);
                }
            }
        }

        return true;
    }
}