// Last updated: 2/14/2026, 1:41:14 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1,sum=0;
        while(n>0)
        {
            prod = (n%10)*prod;
            sum = sum+(n%10);
            n=n/10;
        }
        return prod-sum;
    }
}