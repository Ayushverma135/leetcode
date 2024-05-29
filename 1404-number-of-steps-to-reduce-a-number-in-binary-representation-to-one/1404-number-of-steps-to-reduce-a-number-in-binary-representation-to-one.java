class Solution2 {
    public void add(StringBuilder s){
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)!='0'){
            s.setCharAt(i,'0');
            i--;
        }
        if(i<0){
            s.insert(0,'1');
        }
        else{
            s.setCharAt(i,'1');
        }
    }
    public void divide(StringBuilder s){
        s.deleteCharAt(s.length()-1);
    }
    public int numSteps(String s) {
        StringBuilder str=new StringBuilder(s);
        int op=0;
        int i=str.length()-1;
        while(str.length()>1){
            if(str.charAt(str.length()-1)=='0'){
                divide(str);
                
            }
            else{
                add(str);
            }
            op++;
        }
        return op;
    }
}
class Solution {
    public int numSteps(String s) {
        int i=s.length()-1;
        int temp=0;
        int c=0;
        int op=0;
        while(i>0){
            temp=(s.charAt(i)-'0')+c;
            if(temp%2==1){
                op+=2;
                c=1;
            }
            else{
                op++;
            }
            i--;
        }
        return op+c;
    }
}