class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int max=0;
        for(int i:nums1){
            if(i>max){max=i;}
        }
        int arr[]=new int[max+1];
        int max2=0;
        for(int i:nums2){
            if(i>max2){max2=i;}
        }
        int arr2[]=new int[max2+1];
        for(int i:nums1){
            arr[i]=1;
        }
        for(int i:nums2){
            arr2[i]=1;
        }
        int c=0;
        for(int i=0;i<=Math.min(max,max2);i++){
            if(arr[i]!=0 && arr2[i]!=0){c++;}
        }
        int res[]=new int[c];
        int j=0;
        for(int i=0;i<=Math.min(max,max2);i++){
            if(arr[i]!=0 && arr2[i]!=0){res[j++]=i;}
        }
        return res;
    }
}