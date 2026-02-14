// Last updated: 2/14/2026, 1:41:36 PM
class Solution {
    public int addDigits(int num) {
        if(num % 10 == num)
            return num;
        else
            return addDigits(sum(num));
        
    }

    public int sum(int num)
    {

        int sum = 0;
        while(num > 0)
        {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}