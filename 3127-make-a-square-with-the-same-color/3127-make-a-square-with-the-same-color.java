class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid.length-1;j++){
                int w=0;
                int b=0;
                if(grid[i][j]=='B'){b++;}
                else{w++;}
                if(grid[i][j+1]=='B'){b++;}
                else{w++;}
                if(grid[i+1][j]=='B'){b++;}
                else{w++;}
                if(grid[i+1][j+1]=='B'){b++;}
                else{w++;}
                if(w==3 || b==3 || w==0 || b==0){
                    return true;
                }
            }
        }
        return false;
    }
}