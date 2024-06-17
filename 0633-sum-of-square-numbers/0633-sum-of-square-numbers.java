public class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            long sum = (long) left * left + (long) right * right;
            
            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++; 
            } else {
                right--; 
            }
        }
        return false;
    }
}