// Last updated: 2/14/2026, 1:41:11 PM
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    vector<long long> allSums;

    long long postOrder(TreeNode* node) {
        if (!node) return 0;
        
        long long leftSum = postOrder(node->left);
        long long rightSum = postOrder(node->right);
        
        long long currentSum = node->val + leftSum + rightSum;
        
        allSums.push_back(currentSum);
        
        return currentSum;
    }
public:
    int maxProduct(TreeNode* root) {
        allSums.clear();
        
        long long totalSum = postOrder(root);
        long long maxProd = 0;
        
        for (long long s : allSums) {
            long long currentProd = s * (totalSum - s);
            if (currentProd > maxProd) {
                maxProd = currentProd;
            }
        }
        
        return maxProd % 1000000007;
    }
};