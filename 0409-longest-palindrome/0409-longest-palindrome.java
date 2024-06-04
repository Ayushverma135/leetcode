class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> d=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(d.containsKey(s.charAt(i))){
                d.put(s.charAt(i),d.get(s.charAt(i))+1);
            }
            else{
                d.put(s.charAt(i),1);
            }
        }
        int c=0;
        boolean flag=false;
        for(char key: d.keySet()){
            if(d.get(key)%2==0){
                c+=d.get(key);
            }
            else{
                if(flag==false){
                    c+=d.get(key);
                    flag=true;
                }
                else{
                    c+=d.get(key)-1;
                }
            }
        }
        return c;
    }
}