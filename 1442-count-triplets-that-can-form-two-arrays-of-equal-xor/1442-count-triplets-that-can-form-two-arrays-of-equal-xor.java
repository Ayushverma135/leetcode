class Solution2 {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int a=0;
            for(int j=i+1;j<arr.length;j++){
                a^=arr[j-1];
                int b=0;
                for(int k=j;k<arr.length;k++){
                    b^=arr[k];
                    if(a==b){count++;}
                }
            }
        }
        return count;
    }
}
class Solution3 {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=arr[i];
            for(int k=i+1;k<arr.length;k++){
                xor^=arr[k];
                if(xor==0){count+=k-i;}
            }
        }
        return count;
    }
}
class Solution {
    public int countTriplets(int[] arr) {
        int[] prefixXOR = new int[arr.length + 1];
        prefixXOR[0] = 0;
        System.arraycopy(arr, 0, prefixXOR, 1, arr.length);
        int size = prefixXOR.length;
        for (int i = 1; i < size; i++) {
            prefixXOR[i] ^= prefixXOR[i - 1];
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int k = i + 1; k < size; k++) {
                if (prefixXOR[i] == prefixXOR[k]) {
                    count += k - i - 1;
                }
            }
        }
        return count;
    }
}