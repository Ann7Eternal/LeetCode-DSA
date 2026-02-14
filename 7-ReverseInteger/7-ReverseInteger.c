// Last updated: 2/14/2026, 1:41:56 PM
int reverse(int x){
 long int x1=x;
 long int rev = 0;
 if(x1<0)
 x1 = -1*x1;
 while(x1>0)
 {
     rev = rev*10 + x1%10;
     x1 = x1/10;
 }
 if (x1 >= 0 && rev > 2147483647)
        return 0;
 if(x<0)
 rev = -1*rev;
 return(rev);
}