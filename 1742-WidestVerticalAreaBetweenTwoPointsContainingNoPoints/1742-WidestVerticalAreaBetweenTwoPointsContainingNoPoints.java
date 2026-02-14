// Last updated: 2/14/2026, 1:41:07 PM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
      int xcord[] = new int[points.length];
        int max = 0;
      for(int i =0;i<points.length;i++)
      {
          xcord[i] = points[i][0];
          //System.out.println(xcord[i]);
      }
        Arrays.sort(xcord);
        for (int i=xcord.length-1; i>0;i--){
            if ((xcord[i]-xcord[i-1])>max){
                max=xcord[i]-xcord[i-1];
            }
        }
        return max;  
    }
}