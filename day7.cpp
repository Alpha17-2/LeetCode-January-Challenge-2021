class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        
   int n=s.size();
        if(n==0)
            return 0;
   map<char,int>mymap;
   int i=0,j=0;
   int max_len=INT_MIN;
   for(i=0; j<n ;i++)
   {
       while (j<n && mymap[s[j]]<1)
       {
           mymap[s[j]]++;
           j++;
       }
       max_len=max(max_len,(j-i));
       mymap[s[i]]--;
    }
        return max_len;      
    }
};