class Solution {
    public void traverse(String s, int i, StringBuilder sentence, List<String> all, HashSet<String> dict){
        if(i==s.length()){
            all.add(sentence.toString().trim());
        }
        else{
            for(int j=i+1;j<=s.length();j++){
                int len=sentence.length();
                String word=s.substring(i,j);
                if(dict.contains(word)){
                    sentence.append(word).append(" ");
                    traverse(s,j,sentence,all,dict);
                    sentence.setLength(len);
                }
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            dict.add(wordDict.get(i));
        }
        List<String> all=new ArrayList<>();
        StringBuilder sentence=new StringBuilder();
        traverse(s,0,sentence,all,dict);
        return all;
    }
}