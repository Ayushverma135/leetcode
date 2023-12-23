class Solution {
    public boolean isPathCrossing(String path) {
        HashMap<Character,Pair<Integer,Integer>>d=new HashMap<>();
        d.put('N',new Pair(0,1));
        d.put('E',new Pair(1,0));
        d.put('S',new Pair(0,-1));
        d.put('W',new Pair(-1,0));
        HashSet<Pair<Integer,Integer>>s=new HashSet<>();
        s.add(new Pair(0,0));
        int x=0;
        int y=0;
        for(char i:path.toCharArray()){
            Pair<Integer,Integer> temp=d.get(i);
            x+=temp.getKey();
            y+=temp.getValue();
            Pair<Integer,Integer> flag=new Pair(x,y);
            if(s.contains(flag)){
                return true;
            }
            else{
                s.add(flag);
            }
        }
        return false;
    }
}