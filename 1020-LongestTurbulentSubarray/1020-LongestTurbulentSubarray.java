// Last updated: 8/12/2026, 11:59:18 AM
class Solution {
    public int maxTurbulenceSize(int[] arr) {

        int n = arr.length;

        if (n == 1) return 1;

        int left = 0;
        int maxLen = 1;

        for (int right = 1; right < n; right++) {

            int c = Integer.compare(arr[right - 1], arr[right]);

            if (c == 0) {
                left = right;
            } 
            else if (right == n - 1 ||
                    c * Integer.compare(arr[right], arr[right + 1]) != -1) {

                maxLen = Math.max(maxLen, right - left + 1);
                left = right;
            }
        }

        return maxLen;
    }
}