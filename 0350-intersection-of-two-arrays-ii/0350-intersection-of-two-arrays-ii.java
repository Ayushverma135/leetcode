class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m1=0;
        int m2=0;
        int c=0;
        int j=0;
        int l=0;
        for(int i:nums1){
            if(i>m1){m1=i;}
        }
        for(int i:nums2){
            if(i>m2){m2=i;}
        }
        int arr1[]=new int[m1+1];
        int arr2[]=new int[m2+1];
        for(int i:nums1){
            arr1[i]++;
        }
        for(int i:nums2){
            arr2[i]++;
        }
        int k=Math.min(m1,m2);
        for(int i=0;i<=k;i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                c+=Math.min(arr1[i],arr2[i]);
            }
        }
        System.out.println(c);
        int res[]=new int[c];
        for(int i=0;i<=k;i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                l=Math.min(arr1[i],arr2[i]);
                while(l>0){
                    res[j++]=i;
                    l--;
                }
            }
        }
        return res;
    }
}