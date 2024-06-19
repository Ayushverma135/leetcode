class Solution {
    private int canMakeBouquets(int[] bloomDay, int m, int k, int days) {
        int bouquets = 0;
        int flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowers++;
            } else {
                flowers = 0;
            }
            if(flowers==k){
                bouquets++;
                flowers=0;
            }
        }

        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length) {
            return -1;
        }
        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            if (day < minDay) {
                minDay = day;
            }
            if (day > maxDay) {
                maxDay = day;
            }
        }
        int i=1;
        int j=maxDay;
        int res=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if (canMakeBouquets(bloomDay, m, k, mid)>=m) {
                res=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return res;
    }
}