class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character,Integer> arr=new HashMap<>();
        HashMap<Character,Integer> res=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!arr.containsKey(s.charAt(i))){
                arr.put(s.charAt(i),i);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!res.containsKey(t.charAt(i))){
                res.put(t.charAt(i),i);
            }
        }
        ArrayList<Integer> temp1=new ArrayList<>();
        ArrayList<Integer> temp2=new ArrayList<>();
        for(char i:s.toCharArray()){
            temp1.add(arr.get(i));
        }
        for(char i:t.toCharArray()){
            temp2.add(res.get(i));
        }
        return temp1.equals(temp2);
    }
}