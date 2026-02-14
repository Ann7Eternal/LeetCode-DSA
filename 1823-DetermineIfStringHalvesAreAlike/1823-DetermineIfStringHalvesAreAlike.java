// Last updated: 2/14/2026, 1:41:05 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);
        int c1=0,c2=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            c1++;
            else if(a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')
            c1++;
        }
        for(int j=0;j<b.length();j++)
        {
            if(b.charAt(j)=='a'||b.charAt(j)=='e'||b.charAt(j)=='i'||b.charAt(j)=='o'||b.charAt(j)=='u')
            c2++;
            else if(b.charAt(j)=='A'||b.charAt(j)=='E'||b.charAt(j)=='I'||b.charAt(j)=='O'||b.charAt(j)=='U')
            c2++;
        }
        if(c1==c2)
        return true;
        return false;
    }
}