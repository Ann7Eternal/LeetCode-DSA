// Last updated: 2/14/2026, 1:41:34 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        //int c[l]={0};
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(n!=nums[n-1])
            return n;
            else if(i!=nums[i])
            return i;
        }
    return -1;
    }
}