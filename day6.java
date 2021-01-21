class Solution {
    public int findKthPositive(int[] a, int k) {
        int n=a.length;
        boolean[] freq=new boolean[2001];
        Arrays.fill(freq,false);
        for(int i=0;i<n;++i)
        {
            int val=a[i];
            freq[val]=true;
        }
        int i=0;
        while(k>0)
        {
            ++i;
            if(!freq[i])
            {
                k--;
            }
        }
        return i; 
    }
}
