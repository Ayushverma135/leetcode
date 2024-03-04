class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int refill=0;
        int i=0;
        int j=plants.length-1;
        int A=capacityA;
        int B=capacityB;
        while(i<j){
            if(plants[i]<=capacityA){
                capacityA-=plants[i];
            }
            else{
                capacityA=A-plants[i];
                refill++;
            }

            if(plants[j]<=capacityB){
                capacityB-=plants[j];
            }
            else{
                capacityB=B-plants[j];
                refill++;
            }
            i++;
            j--;
        }
        if(plants.length%2==0){
            return refill;
        }
        if(capacityA>=plants[i] || capacityB>=plants[i]){
            return refill;
        }
        return refill+1;
    }
}