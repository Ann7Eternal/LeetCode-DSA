// Last updated: 2/14/2026, 1:41:55 PM
bool isPalindrome(int x) {
    long int rev=0,temp = x;
    if(x<0)
    return false;
    while(temp)
    {
    rev = rev*10 + temp%10;
    temp = temp/10;
    }
    if(x==rev)
        return true;
    return false; 
}