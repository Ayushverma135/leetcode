class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> q=new PriorityQueue<>(Collections.reverseOrder());
        double sum=0;
        for(int i:nums){
            q.add((double)i);
            sum+=i;
        }
        int op=0;
        double fsum=(double)sum/2;
        while(sum>fsum){
            double temp=q.poll();
            sum-=temp;
            sum+=(double)temp/2;
            q.add((double)temp/2);
            op++;
        }
        return op;

    }
}