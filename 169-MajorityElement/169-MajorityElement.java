// Last updated: 2/14/2026, 1:41:40 PM
class Solution {
    public int majorityElement(int[] arr) {
        int el = 0;
        int len = arr.length;
        int c=0;

        for(int i=0;i<len;i++)
        {
            if(c==0)
            {
                el = arr[i];
                c=1;
            }
            else if(el==arr[i])
            {
                c++;
            }
            else
            c--;
            
        }
        int temp=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==el)
            temp++;
            if(temp>=len/2)
            return arr[i];
        }
        return 0;
    }
}