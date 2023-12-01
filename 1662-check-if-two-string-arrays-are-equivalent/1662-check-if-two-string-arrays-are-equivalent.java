class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String i:word1){
            s1+=i;
        }
        for(String i:word2){
            s2+=i;
        }
        return s1.equals(s2);
    }
}