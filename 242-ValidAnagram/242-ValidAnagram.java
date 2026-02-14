// Last updated: 2/14/2026, 1:41:37 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
         return false;

        char tempArray[] = s.toCharArray();
        char temp1Array[] = t.toCharArray();
        // Sorting temp array using
        Arrays.sort(tempArray);
        Arrays.sort(temp1Array);

         for(int i=0;i<tempArray.length;i++)
         {
             if(tempArray[i] != temp1Array[i])
             return false;
         }
         return true;
        /*int arr[]=new int[26];
        Arrays.fill(arr,0);

         

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-97] +=1;
            arr[t.charAt(i)-97] -=1;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i] != 0)
            return false;
        }
        
        // Returning new sorted string
        //String(tempArray);
        //return true;*/
    }
}