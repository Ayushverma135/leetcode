class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int count=0;
        int flip=0;
        // boolean arr[]=new boolean[nums.length];
        Deque<Integer> q=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            // if(i>=k && arr[i-k]==true){
            //     flip--;
            // }

            // if(i>=k && nums[i-k]==7){
            //     flip--;
            // }
            if(i>=k){
                flip-=q.poll();
            }
            if((flip%2==1 && nums[i]==1)||(flip%2==0 && nums[i]==0)){
                if(i+k>nums.length){
                    return -1;
                }
                count++;
                flip++;
                // nums[i]=7;
                // arr[i]=true;
                q.add(1);
            }
            else{q.add(0);}
        }
        return count;
    }
}