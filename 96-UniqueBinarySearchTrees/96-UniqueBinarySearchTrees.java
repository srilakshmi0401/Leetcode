// Last updated: 8/12/2026, 12:15:26 PM
class Solution {
    public int numTrees(int n) {
        return count(n);
    }
    private int count(int n) {
        if (n <= 1) return 1;
        int ans = 0;
        for (int root = 1; root <= n; root++) {
            int left = count(root - 1);
            int right = count(n - root);

            ans += left * right;
        }
        return ans;
    }
}