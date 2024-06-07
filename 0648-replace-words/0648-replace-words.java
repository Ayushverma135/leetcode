class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");
        String[] res=new String[str.length];
        // for(int i=0;i<str.length;i++){
        //     res[i]=str[i];
        // }
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<dictionary.size();i++){
            set.add(dictionary.get(i));
        }
        for(int i=0;i<str.length;i++){
            int f=0;
            for(int j=1;j<str[i].length();j++){
                if(set.contains(str[i].substring(0,j))){
                    f=1;
                    res[i]=str[i].substring(0,j);
                    break;
                }
            }
            if(f==0){
                res[i]=str[i];
            }
        }
        
        
        return String.join(" ",res);
    }
}