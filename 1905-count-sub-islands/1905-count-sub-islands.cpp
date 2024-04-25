class Solution {
    int m, n;
    vector<vector<int>> dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
    public:
        int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
            m = grid2.size();
            n = grid2[0].size();
            int count = 0;
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(grid2[i][j] == 1) {
                        if(isSubIsland(i,j, grid1, grid2)) {
                            count++;
                        }
                    }
                }
            }
            return count;
}
private:
    bool isSubIsland(int i, int j, vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        grid2[i][j] = 2;
        bool answer = true;
        if(grid1[i][j] != 1) answer = false;

        for(auto& delta : dir) {
            int i2 = i + delta[0], j2 = j + delta[1];
            if(i2 >= 0 && j2 >= 0 && i2 < m && j2 < n && grid2[i2][j2] == 1) {
                if(!isSubIsland(i2, j2, grid1, grid2)) answer = false;
            }
        }
        return answer;
    }
};