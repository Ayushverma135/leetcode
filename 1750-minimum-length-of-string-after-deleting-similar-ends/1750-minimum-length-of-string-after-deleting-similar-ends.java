class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        // int k=0;
        // int l=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            else{
                char temp=s.charAt(i);
                for(int k=i;k<=j;k++){
                    if(s.charAt(k)==temp){
                        i++;
                    }
                    else{
                        break;
                    }
                }
                for(int k=j;k>=i;k--){
                    if(s.charAt(k)==temp){
                        j--;
                    }
                    else{
                        break;
                    }
                }
            }
            // i++;
            // j--;
        }
        // if(k-i>0 || l-j>0){
        //     return j-i+1+k-i+l-j;
        // }
        return j-i+1;
    }
}