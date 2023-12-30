class Solution {
    public boolean makeEqual(String[] words) {
        if (words.length == 1) {
			return true;
		}
		int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(map.containsKey(words[i].charAt(j))){
                    map.put(words[i].charAt(j),map.get(words[i].charAt(j))+1);
                }
                else{
                    map.put(words[i].charAt(j),1);
                }
            }
        }
        for(char key:map.keySet()){
            if(map.get(key)%words.length!=0){
                return false;
            }
        }
        return true;
        
    }
}