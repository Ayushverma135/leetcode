class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            if(s.size()==0){
                m.put(nums2[i],-1);
            }
            else if(s.size()>0 && nums2[i]<s.peek()){
                m.put(nums2[i],s.peek());
            }
            else if(s.size()>0 && nums2[i]>=s.peek()){
                while(!s.isEmpty() && nums2[i]>=s.peek()){
                s.pop();
                }
                if(s.size()==0){
                m.put(nums2[i],-1);
                }
                else{
                m.put(nums2[i],s.peek());
                }
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            arr[i]=m.get(nums1[i]);
        }
        return arr;
    }
}