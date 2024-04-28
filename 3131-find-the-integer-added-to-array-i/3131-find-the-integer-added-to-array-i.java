class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        if(nums1.length==1 && nums2.length==1){
            return nums2[0]-nums1[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0]-nums1[0];
    }
}