// Last updated: 2/14/2026, 1:41:17 PM
class Solution {
    public int findSpecialInteger(int[] arr) {
        int el=arr[0];
        int len = arr.length;
        int c=1;

        for(int i=1;i<len;i++)
        {
            if(arr[i]==el)
            c++;
            else
            c=1;
            if(c>len/4)
            return arr[i];
            el=arr[i];
        }
        return el;
    }
}