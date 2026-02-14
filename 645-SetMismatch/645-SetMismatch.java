// Last updated: 2/14/2026, 1:41:29 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] c = new int[2];
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                c[0] = Math.abs(nums[i]);
            else
                nums[index] = -nums[index];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                c[1] = i + 1;
                break;
            }
        }

        return c;
    }
}