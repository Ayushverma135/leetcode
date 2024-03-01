class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones=0;
        int zeroes=0;
        for(char i:s.toCharArray()){
            if(i=='1'){ones++;}
            if(i=='0'){zeroes++;}
        }
        StringBuilder arr=new StringBuilder();
        int i=0;
        while(ones!=1){
            arr.append('1');
            ones--;
        }
        while(zeroes!=0){
            arr.append('0');
            zeroes--;
        }
        arr.append('1');
        return arr.toString();
    }
}