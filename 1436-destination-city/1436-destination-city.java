class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set2=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            set2.add(paths.get(i).get(0));
        }
        int k=paths.size()-1;
        for(int i=0;i<paths.size();i++){
            if(!set2.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "";
    }
}