class Solution {
    public boolean match(int d1[],int d2[]){
        for(int i=0;i<26;i++){
            if(d1[i]!=d2[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int d1[]=new int[26];
        int d2[]=new int[26];
        if(p.length()>s.length()){
            return new ArrayList<Integer>();
        } 
        for(int i=0;i<p.length();i++){
            d1[p.charAt(i)-'a']++;
            d2[s.charAt(i)-'a']++;
        }
        List<Integer> res=new ArrayList<>();
        int i=0;
        for(i=0;i<s.length()-p.length();i++){
            if(match(d1,d2)){
                res.add(i);
            }
            d2[s.charAt(i+p.length())-'a']++;
            d2[s.charAt(i)-'a']--;
        }
        if(match(d1,d2)){
            res.add(i);
        }
        return res;
    }
}