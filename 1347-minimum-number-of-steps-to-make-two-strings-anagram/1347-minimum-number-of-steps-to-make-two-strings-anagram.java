class Solution {
    public int minSteps(String s, String t) {
        int map1[]=new int[26];
        int map2[]=new int[26];
        int res=0;
        for(char i:s.toCharArray()){
            map1[i-'a']++;
        }
        for(char i:t.toCharArray()){
            map2[i-'a']++;
        }
        for(int i=0;i<map1.length;i++){
            if(map1[i]!=0){
                if(map2[i]==0){
                    res+=map1[i];
                }
                else{
                    if(map2[i]<map1[i]){
                        res+=map1[i]-map2[i];
                    }
                }
            }
        }
        return res;
    }
}