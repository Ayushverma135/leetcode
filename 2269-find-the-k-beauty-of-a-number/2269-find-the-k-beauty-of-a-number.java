class Solution {
    public int divisorSubstrings(int num, int k) {
        int ans=0;
        String res=Integer.toString(num);
        for(int i=0;i<res.length()-k+1;i++){
            int temp=Integer.valueOf(res.substring(i,i+k));
            System.out.println(temp);
            if(temp!=0 && num % temp==0){
                ans++;
            }
        }
        return ans;
    }
}