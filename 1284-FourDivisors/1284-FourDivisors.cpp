// Last updated: 2/14/2026, 1:41:16 PM
class Solution {
public:
    int sumFourDivisors(vector<int>& nums) {
        int totalSum = 0;

        for (int num : nums) {
            int sum = 0;
            int count = 0;
            for (int j = 1; j * j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    sum += j;

                    if (j != num / j) {
                        count++;
                        sum += num / j;
                    }
                }
                
                if (count > 4) break;
            }

            if (count == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
};