class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int arr[][]=new int[profits.length][2];
        for(int i=0;i<profits.length;i++){
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        int count=0;
        int idx=0;
        while(k>0){
            // int idx=0;
            // int temp=0;
            // for(int i=0;i<arr.length;i++){
            //     if(w>=arr[i][0]){
            //         if(arr[i][1]>temp){
            //             temp=arr[i][1];
            //             idx=i;
            //         }
            //     }
            //     else{break;}
            // }
            
            while(idx<arr.length && w>=arr[idx][0]){
                q.offer(arr[idx++][1]);
            }
            if(q.isEmpty()){break;}
            w+=q.peek();
            q.poll();
            k--;
        }
        return w;
    }
}