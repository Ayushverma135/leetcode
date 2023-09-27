class Solution {
    public String removeDuplicateLetters(String s) {
        boolean bool[]=new boolean[26];
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(bool[ch-'a']==true)
                continue;
            while(!st.isEmpty() && st.peek()>ch && i<arr[st.peek()-'a']){
                bool[st.pop()-'a']=false;
            }
            st.push(ch);
            bool[ch-'a']=true;
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}