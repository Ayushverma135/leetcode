class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        boolean flipped = false;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i] ^ (flipped ? 1 : 0);
            if (currentValue == 0) {
                count++;
                flipped = !flipped;
            }
        }

        return count;
    }
}