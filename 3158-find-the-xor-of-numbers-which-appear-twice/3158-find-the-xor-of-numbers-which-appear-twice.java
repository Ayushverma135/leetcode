class Solution2 {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int res=0;
        for(int i:map.keySet()){
            if(map.get(i)>1){
                res^=i;
            }
        }
        return res;
    }
}
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[]=new int[51];
        int res=0;
        for(int i:nums){
            if(arr[i]!=0){
                res^=i;
            }
            else{
                arr[i]=1;
            }
        }
        return res;
    }
}