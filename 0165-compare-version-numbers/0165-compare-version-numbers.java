class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        while(i<version1.length() && j<version2.length()){
            while(i<version1.length() && version1.charAt(i)!='.'){
                sum1+=sum1*10+(version1.charAt(i)-'0');
                i++;
            }
            while(j<version2.length() && version2.charAt(j)!='.'){
                sum2+=sum2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(sum1!=sum2){
                return sum1>sum2? 1:-1;
            }
            sum1=0;
            sum2=0;
            if(i>=version1.length()){break;}
            if(j>=version2.length()){break;}
            i++;
            j++;
        }
        while(i<version1.length()){
            while(i<version1.length() && version1.charAt(i)!='.'){
            sum1+=sum1*10+(version1.charAt(i)-'0');
            i++;
        }
        i++;
        }
        while(j<version2.length()){
            while(j<version2.length() && version2.charAt(j)!='.'){
            sum2+=sum2*10+(version2.charAt(j)-'0');
            j++;
        }
        j++;
        }
        if(sum1!=sum2){
                return sum1>sum2? 1:-1;
            }
        return 0;
    }
}