class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();
        List<Integer> current = new ArrayList<>();       
        backtrack(nums, 0, current, resultSet);      
        result.addAll(resultSet);
        return result;
    }
    
    private void backtrack(int[] nums, int start, List<Integer> current, Set<List<Integer>> resultSet) {
        if (current.size() >= 2) {
            resultSet.add(new ArrayList<>(current));
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                current.add(nums[i]);
                backtrack(nums, i + 1, current, resultSet);
                current.remove(current.size() - 1);
            }
        }
    }
}