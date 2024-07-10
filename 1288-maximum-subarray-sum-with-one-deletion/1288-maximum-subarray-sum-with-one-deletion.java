class Solution {
    public int maximumSum(int[] arr) {
        int pre[]=new int[arr.length];
        int suf[]=new int[arr.length];
        pre[0]=arr[0];
        suf[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            pre[i]=Math.max(arr[i],arr[i]+pre[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            suf[i]=Math.max(arr[i],arr[i]+suf[i+1]);
        }
        int res=Integer.MIN_VALUE;
        for(int i:pre){
            res=Math.max(i,res);
        }
        for(int i=1;i<arr.length-1;i++){
            res=Math.max(res,pre[i-1]+suf[i+1]);
        }
        return res;
    }
}