class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            HashMap<Character,Character> dw=new HashMap<>();
            HashMap<Character,Character> dp=new HashMap<>();
            int flag=0;
            for(int j=0;j<pattern.length();j++){
                if(!dw.containsKey(words[i].charAt(j))){
                    dw.put(words[i].charAt(j),pattern.charAt(j));
                }
                if(!dp.containsKey(pattern.charAt(j))){
                    dp.put(pattern.charAt(j),words[i].charAt(j));
                }
                if(dw.get(words[i].charAt(j))!=pattern.charAt(j) || dp.get(pattern.charAt(j))!=words[i].charAt(j)){
                    flag=1;
                }
            }
            if(flag==0){
                    res.add(words[i]);
                }
        }
        return res;
    }
}