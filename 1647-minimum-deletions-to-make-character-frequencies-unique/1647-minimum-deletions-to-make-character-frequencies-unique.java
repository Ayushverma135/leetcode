class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> d=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(d.containsKey(s.charAt(i))){
                d.put(s.charAt(i),d.get(s.charAt(i))+1);
            }
            else{
                d.put(s.charAt(i),1);
            }
        }
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(char i:d.keySet()){
            arr.add(d.get(i));
        }
        int c=0;
        int f=0;
        for(int i=0;i<arr.size();i++){
            if(set.contains(arr.get(i))){
                int x=arr.get(i);
                while(set.contains(x)){
                    if(x==0 && f==1){
                        break;
                    }
                    x-=1;
                    c++;
                }
                if(x==0){
                    f=1;
                }
                set.add(x);  
            }
            else{
                set.add(arr.get(i));
            }
        }
        return c;
    }
}