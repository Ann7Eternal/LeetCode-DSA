// Last updated: 2/14/2026, 1:40:59 PM
class Solution {
public:
    long long maxMatrixSum(vector<vector<int>>& matrix) {
        int n = matrix.size();      
        int m = matrix[0].size();   
        
        long long cnt = 0;          
        long long Smallest = LLONG_MAX; 
        long long sum = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] < 0)
                    cnt++;
                
                long long val = abs(matrix[i][j]);
                Smallest = min(Smallest, val);
                sum += val;
            }
        }
        
        if(cnt % 2 == 0)
            return sum;
        
        return sum - 2 * Smallest;
    }
};