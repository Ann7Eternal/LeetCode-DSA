// Last updated: 2/14/2026, 1:41:01 PM
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--)
        {
            switch(num.charAt(i))
            {
                case '9':
                    return num.substring(0,i+1);
                case '7':
                    return num.substring(0,i+1);
                case '5':
                    return num.substring(0,i+1);
                case '3':
                    return num.substring(0,i+1);
                case '1':
                    return num.substring(0,i+1);
            }
        }
        return "";
    }
}