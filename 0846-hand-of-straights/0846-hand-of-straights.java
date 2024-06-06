class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int k=groupSize;
        if (hand.length % k != 0) {
            return false;
        }
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < hand.length; i++) {
            if (map.get(hand[i]) != 0) {
                for (int j = 0; j < k; j++) {
                    if (map.getOrDefault(hand[i] + j, 0) == 0) {
                        return false;
                    }
                    map.put(hand[i] + j, map.get(hand[i] + j) - 1);
                }
            }
        }

        return true;
    }
}