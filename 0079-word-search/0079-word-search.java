class Solution {
    boolean flag=false;
    public boolean dfs(int i,int j,int n,int m,int k,char board[][],String word){
        if(k==word.length()){
            return true;
        }
        if(i<0 ||i>=n ||j<0||j>=m || board[i][j]=='#'){
            return false;
        }
        if(board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        if(dfs(i+1,j,n,m,k+1,board,word)){return true;}
        if(dfs(i,j+1,n,m,k+1,board,word)){return true;}
        if(dfs(i-1,j,n,m,k+1,board,word)){return true;}
        if(dfs(i,j-1,n,m,k+1,board,word)){return true;}
        board[i][j]=temp;
        return false;
        
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int o=word.length();
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(i,j,n,m,0,board,word)){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
}