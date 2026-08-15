// Last updated: 8/15/2026, 4:02:01 PM
1class Solution {
2    public int maxTurbulenceSize(int[] arr) {
3
4        int n = arr.length;
5
6        if (n == 1) return 1;
7
8        int left = 0;
9        int maxLen = 1;
10
11        for (int right = 1; right < n; right++) {
12
13            int c = Integer.compare(arr[right - 1], arr[right]);
14
15            if (c == 0) {
16                left = right;
17            } 
18            else if (right == n - 1 ||
19                    c * Integer.compare(arr[right], arr[right + 1]) != -1) {
20
21                maxLen = Math.max(maxLen, right - left + 1);
22                left = right;
23            }
24        }
25
26        return maxLen;
27    }
28}