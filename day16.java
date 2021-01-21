class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
     sort(nums.rbegin(),nums.rend());
        int n=nums.size();
        int ans=0;
        int last=n-1;
        return nums[k-1];
    }
};