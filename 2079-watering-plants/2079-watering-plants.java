class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int c=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<=capacity){
                steps+=1;
                capacity-=plants[i];
            }
            else{
                steps+=2*i+1;
                capacity=c-plants[i];
            }
        }
        return steps;
    }
}