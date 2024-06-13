class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int seat[]=new int[101];
        int student[]=new int[101];
        for(int i:seats){
            seat[i]++;
        }
        for(int i:students){
            student[i]++;
        }
        int count=0;
        int i=0;
        int j=0;
        while(i<101 && j<101){
            while(i<101 && seat[i]==0){
                i++;
            }
            while(j<101 && student[j]==0){
                j++;
            }
            while(i<101 && student[j]>0 && j<101 && seat[i]>0){
                count+=Math.abs(i - j);
                seat[i]--;
                student[j]--;
            }
        }
        return count;
    }
}