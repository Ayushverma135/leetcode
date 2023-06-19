class Solution {
    public int numberOfSubstrings(String s) {
        int a=0,b=0,c=0;
        int i=0,j=0;
        int count=0;
        while(j<s.length()){
            if(s.charAt(j)=='a'){
                a++;
            }
            else if(s.charAt(j)=='b'){
                b++;
            }
            else if(s.charAt(j)=='c'){
                c++;
            }
            if(a!=0 && b!=0 && c!=0){
                while(a!=0 && b!=0 && c!=0){
                    count+=s.length()-j;
                    if(s.charAt(i)=='a'){
                        a--;
                    }
                    else if(s.charAt(i)=='b'){
                        b--;
                    }
                    else if(s.charAt(i)=='c'){
                        c--;
                    }
                    i++;
                }
            }
            j++;
        }
        return count;
    }
}