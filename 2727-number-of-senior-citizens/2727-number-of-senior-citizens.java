class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String str=details[i].substring(11,13);
            if(Integer.parseInt(str)>60){count++;}
        }
        return count;
    }
}