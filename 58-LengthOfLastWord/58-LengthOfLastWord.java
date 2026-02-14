// Last updated: 2/14/2026, 1:41:51 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.stripTrailing();
    char[] wrd = s.toCharArray();
        int c=0;
        for(int i=wrd.length-1;i>=0;i--)
        {
          //if(i!=wrd.length-1&&wrd[i]==' ')
          if(wrd[i]==' ')
          break;
          c++;
        }
        return c;
    }
}