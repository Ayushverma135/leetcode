class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                arr[i]=mapping[0];
            }
            else{
                int temp=nums[i];
                int newTemp=0;
                int m=1;
                while(temp>0){
                int a=temp%10;
                newTemp=mapping[a]*m+newTemp;
                m*=10;
                temp/=10;
                }
                arr[i]=newTemp;
            }  
        }
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(nums[i]);
            }
            else{
                map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(nums[i]);
            }
            
        }
        Arrays.sort(arr);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.get(arr[i]).size()>1){
                res.add(map.get(arr[i]).get(0));
                map.get(arr[i]).remove(0);
            }
            else{
                res.add(map.get(arr[i]).get(0));
            }
            System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            nums[i]=res.get(i);
        }
        // int[] obj=res.toArray();
        return nums;
    }
}