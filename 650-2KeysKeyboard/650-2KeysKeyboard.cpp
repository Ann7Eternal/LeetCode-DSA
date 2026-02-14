// Last updated: 2/14/2026, 1:41:28 PM
class Solution {
public:
    int minSteps(int n) {
        if (n == 1)
        return 0;
        
        int steps = 0;
        int fact = 2;
        
        while (n > 1) 
        {
            while (n % fact == 0) 
            {
                steps = steps+fact;
                n = n/fact;
            }
            fact++;
        }
        
        return steps;
    }
};