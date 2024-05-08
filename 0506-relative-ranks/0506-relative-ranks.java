class Solution {
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        int arr[]=new int[score.length];

        int max=0;
        for(int i=0;i<score.length;i++){
            arr[i]=score[i];
            if(score[i]>max){max=score[i];}
        }

        Arrays.sort(arr);
        reverse(arr);
        int temp[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]=i;
        }

        int c=0;
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++){
            if(score[i]==arr[c] && c==0){
                res[i]="Gold Medal";
                c++;
            }
            else if(score[i]==arr[c] && c==1){
                res[i]="Silver Medal";
                c++;
            }
            else if(score[i]==arr[c] && c==2){
                res[i]="Bronze Medal";
                c++;
            }
            else{
                if(temp[score[i]]==2){
                    res[i]="Bronze Medal";
                }
                else if(temp[score[i]]==1){
                    res[i]="Silver Medal";
                }
                else{
                    res[i]=Integer.toString(temp[score[i]]+1);
                }
                
            }
        }
        return res;
    }
}