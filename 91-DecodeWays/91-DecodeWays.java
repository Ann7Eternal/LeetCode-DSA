// Last updated: 2/14/2026, 1:41:45 PM
class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0 || s.charAt(0)=='0')
        return 0;

        int n =s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++)
        {
            int digit1 = s.charAt(i-1) - '0';
            int digit2 = Integer.parseInt(s.substring(i-2, i));
            if(digit1 != 0)
            dp[i] = dp[i]+dp[i-1];

            if(10<=digit2 && digit2<=26)
            dp[i] = dp[i]+dp[i-2];
        }
        return dp[n];
    }
}