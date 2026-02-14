// Last updated: 2/14/2026, 1:41:00 PM
class Solution {
    public int maxProductDifference(int[] nums) {
       /* int temp;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-1;j++)
            {
              if(j+1>len)
              break;  
              else if(nums[j]>nums[j+1])
              {
                  temp = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = temp;
              }
            }
        }
        int prod1= (nums[len-1])*(nums[len-2]);
        int prod2= (nums[0]*nums[1]);
        return prod1-prod2; */
        int len=nums.length;
        Arrays.sort(nums);
        //int prod1= (nums[len-1])*(nums[len-2]);
        //int prod2= (nums[0]*nums[1]);
        //return prod1-prod2;
        return (nums[len-1])*(nums[len-2])-(nums[0]*nums[1]);
    }
}