class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Integer arr[]=new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = map.get(a);
                int freqB = map.get(b);
                if (freqA != freqB) {
                    return Integer.compare(freqA, freqB);
                } else {
                    return Integer.compare(b, a);
                }
            }
        });
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}