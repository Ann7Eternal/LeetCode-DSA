// Last updated: 2/14/2026, 1:41:58 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int len = nums.length;
        int arr[]=new int[2];
        // for(int i=0;i<len;i++)
        // {
        //     for(int j=i+1;j<len;j++)
        //     {
        //         if(nums[i]+nums[j]==target)
        //         {
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }
        // }
        // return arr;
        for(int i=0;i<nums.length;i++)
        {
            int ptr=i+1;
            while(ptr<nums.length)
            {
                if(nums[i]+nums[ptr]==target)
                {
                    arr[0]=i;
                    arr[1]=ptr;
                    return arr;
                }
                ptr++;
            }
        }
        return arr;
    }
}