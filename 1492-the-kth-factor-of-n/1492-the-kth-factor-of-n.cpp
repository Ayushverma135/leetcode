class Solution {
public:
    int kthFactor(int n, int k) {
        vector<int>fac;
        int i=1;
        while(i*i<=n){
            if(n%i==0){
                fac.push_back(i);
            }
            i++;
        }
        int x=fac.size()-1;
        while(x>=0){
            if(n/fac[x]!=fac[x]){
                fac.push_back(n/fac[x]);
            }
            x--;
        }
        if(fac.size()<k){
            return -1;
        }
        return fac[k-1];

    }
};