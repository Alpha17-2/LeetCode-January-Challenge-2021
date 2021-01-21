class Solution {
    public int numRescueBoats(int[] p, int limit) {
        int n=p.length;
        Arrays.sort(p);
        int ans=0;
        int last=n-1;
        int start=0;                   
        while(start<last)        
        {
            if(p[start]+p[last]<=limit)
            {
                start++;
                last--;
            }
            else
            {
                last--;
            }
            ans++;
        }
        if(start==last)
            ++ans;
        return ans;
    }
}