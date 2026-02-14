// Last updated: 2/14/2026, 1:41:44 PM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9')
            {
                str+=s.charAt(i);
            }
        }
        int l=0,r=str.length()-1;
        while(l<=r)
        {
            if(str.charAt(l)==str.charAt(r))
            {
                l++;
                r--;
            }
            else
                return false;
        }
        return true;
    }
}