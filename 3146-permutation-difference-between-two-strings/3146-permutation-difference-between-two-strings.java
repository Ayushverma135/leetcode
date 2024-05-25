class Solution {
    public int findPermutationDifference(String s, String t) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        int ans=0;
        for(int i=0;i<t.length();i++){
            ans+=Math.abs(arr[t.charAt(i)-'a']-i);
        }
        return ans;
    }
}