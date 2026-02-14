// Last updated: 2/14/2026, 1:40:56 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int l = word.length();
        int k=-1;
        String rev=""; 
        for(int i=0;i<l;i++)
        {
            if(word.charAt(i)==ch){
            k=i;
            break;
            }
        }
        if(k==-1)
        return word;
        for(int i=0;i<=k;i++)
        rev = word.charAt(i)+rev;
        for(int i=k+1;i<l;i++)
        rev = rev+word.charAt(i);
        return rev;
    }
}