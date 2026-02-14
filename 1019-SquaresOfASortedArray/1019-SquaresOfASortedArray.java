// Last updated: 2/14/2026, 1:41:20 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}