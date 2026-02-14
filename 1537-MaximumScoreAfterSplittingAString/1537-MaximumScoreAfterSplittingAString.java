// Last updated: 2/14/2026, 1:41:10 PM
class Solution {
    public int maxScore(String s) {
        int length = s.length();
        int ones = 0;
        int temp = s.charAt(0) == '0' ? 1 : 0;
        int score = temp;
        for (int i = 1; i < length - 1; i++) {
            if (s.charAt(i) == '0') {
                temp += 1;
            } else {
                ones++;
                temp -= 1;
            }

            if (temp > score) {
                score = temp;
            }
        }
        ones += (s.charAt(length - 1) == '1' ? 1 : 0);

        return ones + score;
    }
}