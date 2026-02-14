// Last updated: 2/14/2026, 1:41:38 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        return true;
        for(int i=1;i<=31;i++)
        {
            if(n%2!=0)
            return false;
            else if((int)Math.pow(2,i)==n)
            return true;
        }
        return false;
    }
}