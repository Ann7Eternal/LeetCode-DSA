// Last updated: 2/14/2026, 1:40:50 PM
class Solution {
public:
    int scoreOfString(string s) {
        int n=s.size();
        int a=0;
        for(int i=1;i<n;i++)
        a = a+abs(s[i]-s[i-1]);
        return a;
    }
};

auto init = []() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    return 'c';
}();