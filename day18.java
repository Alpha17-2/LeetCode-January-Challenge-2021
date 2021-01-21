class Solution {
public:
    int maxOperations(vector<int>& a, int k) {
        
        int ans=0;
        map<int,int>mymap;
        for(auto x:a)
        {
            int d=k-x;
            if(mymap[d]>0)
            {
                ans++;
                mymap[d]--;
            }
            else
                mymap[x]++;
        }
        return ans;
    }
};