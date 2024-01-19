class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int res[]=new int[2001];
        for(int i=0;i<arr.length;i++){
            res[arr[i]+1000]++;
        }
        int c=0;
        for(int i:res){
            if(i!=0){c++;}
        }
        int temp[]=new int[c];
        int j=0;
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                temp[j++]=res[i];
            }
        }
        Arrays.sort(temp);
        for(int i=0;i<temp.length-1;i++){
            if(temp[i]==temp[i+1]){
                return false;
            }
        }
        return true;
    }
}