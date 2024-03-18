class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int max=0;
        int c=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)-'a']){
                max=arr[s.charAt(i)-'a'];
            }
            if(i==max){
                res.add(max-c+1);
                c=i+1;
            }
        }
        return res;
    }
}