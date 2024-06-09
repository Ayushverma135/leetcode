class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length; 
        if (k >= n) {
            int max = skills[0];
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (skills[i] > max) {
                    max = skills[i];
                    ans = i;
                }
            }
            return ans;
        }
        HashMap<Integer,Integer> index= new HashMap<>();
        for(int i=0;i<skills.length;i++){
            index.put(skills[i],i);
        }
        
        HashMap<Integer,Integer> score=new HashMap<>();
        for(int i=0;i<skills.length;i++){
            score.put(skills[i],0);
        }
        
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i:skills){
            deque.addLast(i);
        }
        
        while(!deque.isEmpty()){
            int a=deque.removeFirst();
            int b=deque.removeFirst();
            if(a>b){
                deque.addFirst(a);
                deque.addLast(b);
                score.put(a,score.get(a)+1);
                if(score.get(a)>=k){
                    return  index.get(a);
                }
            }
            else{
                deque.addFirst(b);
                deque.addLast(a);
                score.put(b,score.get(b)+1);
                if(score.get(b)>=k){
                    return  index.get(b);
                }
            }  
        }
        return -1;
    }
}