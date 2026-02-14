// Last updated: 2/14/2026, 1:41:49 PM
class Solution {
    public int mySqrt(int x) {
        if(x<2)
        return x;
        double y=x;
        double z=(y+(x/y))/2;
        while((y-z)>=0.00001)
        {
            y=z;
            z=(y+(x/y))/2;
        }
        return (int)z;
    }
}