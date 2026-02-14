// Last updated: 2/14/2026, 1:41:46 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m ; i<m+n ; i++)
            nums1[i] = nums2[i-m];
        Arrays.sort(nums1);
    }
}