class Solution {
public:
     bool canFormArray(vector<int>& a, vector<vector<int>>& p) {
     map<int,int>mymap;
     map<int,int>isthere;
     for(int i=0;i<p.size();i++)
     {
         mymap[p[i][0]]=i;
         isthere[p[i][0]]++;
     }
     int current=0;
     int n=a.size();
        while(current<n)
        {
            int val=a[current];
            if(isthere[val]>0)
            {
                int index=mymap[val];
                int lastIndex=p[index].size();
                for(int start=0;start<lastIndex;start++,current++)
                {
                    if(a[current]!=p[index][start])
                        return false;
                }
            }
            else
                return false;
        }
        return true;        
    }
};