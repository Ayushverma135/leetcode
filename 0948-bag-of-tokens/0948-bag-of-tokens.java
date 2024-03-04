class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0;
        int j=tokens.length-1;
        int max=0;
        while(i<=j){
            if(tokens[i]<=power){
                score++;
                power-=tokens[i];
                i++;
                // max=Math.max(max,score);
            }
            else if(i<j && score>=1){
                power+=tokens[j];
                score--;
                j--;
            }
            else{
                return score;
                // power+=tokens[j];
                // score--;
                // j--;
            }
        }       
        return score;
    }
}