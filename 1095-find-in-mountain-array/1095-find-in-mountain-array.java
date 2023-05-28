/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int i=0;
        int j=mountainArr.length()-1;
        int mid;
        while(i<j){
            mid=i+(j-i)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                j=mid;
            }
            else{
                i=mid+1;
            }
        }
        if(target==mountainArr.get(j)){
            return j;
        }

        i=0;
        int k=j-1;
        while(i<=k){
            mid=i+(k-i)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)>target){
                k=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        int idx1=k;
        k=j+1;
        j=mountainArr.length()-1;
        while(k<=j){
            mid=k+(j-k)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }
            else if(mountainArr.get(mid)>target){
                k=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
}