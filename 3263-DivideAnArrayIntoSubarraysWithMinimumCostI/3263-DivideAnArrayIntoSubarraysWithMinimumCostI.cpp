// Last updated: 2/14/2026, 1:40:52 PM
class Solution {
public:
    int minimumCost(vector<int>& nums) {
        sort(nums.begin()+1, nums.end());
        return (nums[0] + nums[1] + nums[2]);
    }
};