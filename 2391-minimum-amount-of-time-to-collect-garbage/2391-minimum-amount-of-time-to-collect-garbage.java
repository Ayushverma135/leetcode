class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int p=0;
        int g=0;
        int m=0;
        int lp=0;
        int lm=0;
        int lg=0;
        int res=0;
        for(int i=1;i<travel.length;i++){
            travel[i]+=travel[i-1];
        }
        for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
            for(char j:s.toCharArray()){
                if(j=='M'){
                    lm=i;
                }
                if(j=='P'){
                    lp=i;
                }
                if(j=='G'){
                    lg=i;
                }
            }
            res+=s.length();
        }
        if(lm!=0){
            res+=travel[lm-1];
        }
        if(lp!=0){
            res+=travel[lp-1];
        }
        if(lg!=0){
            res+=travel[lg-1];
        }
        return res;
    }
}