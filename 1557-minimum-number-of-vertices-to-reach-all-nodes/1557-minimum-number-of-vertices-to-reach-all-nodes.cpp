class Solution {
public:
    vector<int> findSmallestSetOfVertices(int n, vector<vector<int>>& edges) {
        map<int,int>mp;
        for(auto it: edges)
        {
            mp[it[1]]++;
        }
        vector<int>ans;
        for(int i=0;i<n;i++)
        {
            if(!mp.count(i))
            ans.push_back(i);
        }

        return ans;
    }
};