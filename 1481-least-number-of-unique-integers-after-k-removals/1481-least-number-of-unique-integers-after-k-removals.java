class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> d=new HashMap<>();
        for(int i:arr){
            if(d.containsKey(i)){
                d.put(i,d.get(i)+1);
            }
            else{
                d.put(i,1);
            }
        }
        ArrayList<Integer> res=new ArrayList<>(d.values());
        Collections.sort(res);
        int c=0;
        for(int i=0;i<res.size();i++){
            c+=res.get(i);
            if(c>k){
                return res.size()-i;
            }
        }
        return 0;
    }
}