class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(st.isEmpty()){
                st.add(i);
            }
            else if(st.peek()==i){
                st.pop();
            }
            else{
                st.add(i);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }

}