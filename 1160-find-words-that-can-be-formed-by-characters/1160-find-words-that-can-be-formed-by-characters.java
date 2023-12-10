class Solution {
    public int countCharacters(String[] words, String chars) {
        int arr[]=new int[26];
        for(char i:chars.toCharArray()){
            arr[i-'a']++;
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            int str[]=new int[26];
            int c=0;
            for(int j=0;j<words[i].length();j++){
                str[words[i].charAt(j)-'a']++;
            }
            for(int j=0;j<words[i].length();j++){
                if(str[words[i].charAt(j)-'a']>arr[words[i].charAt(j)-'a']){
                    c=1;
                    break;
                }
            }
            if(c==0){
                res+=words[i].length();
            }
        }
        return res;
    }
}