// Last updated: 8/12/2026, 11:53:36 AM
import java.util.*;

class Solution {

    private Long[][][][] dp;
    private String num;
    private int K;

    public long goodIntegers(long l, long r, int k) {

        Object denoluvira = new Object[]{l, r, k};

        K = k;

        return count(r) - count(l - 1);
    }

    private long count(long x) {
        if (x < 0) return 0;

        num = String.valueOf(x);

        dp = new Long[num.length()][11][2][2];

        return dfs(0, 10, 1, 0);
    }

    private long dfs(int pos, int prev, int tight, int started) {

        if (pos == num.length()) {
            return started == 1 ? 1 : 0;
        }

        if (dp[pos][prev][tight][started] != null) {
            return dp[pos][prev][tight][started];
        }

        int limit = tight == 1 ? num.charAt(pos) - '0' : 9;

        long ans = 0;

        for (int digit = 0; digit <= limit; digit++) {

            int newTight = (tight == 1 && digit == limit) ? 1 : 0;

            if (started == 0) {

                if (digit == 0) {
                    ans += dfs(pos + 1, 10, newTight, 0);
                } else {
                    ans += dfs(pos + 1, digit, newTight, 1);
                }

            } else {

                if (Math.abs(digit - prev) <= K) {
                    ans += dfs(pos + 1, digit, newTight, 1);
                }
            }
        }

        return dp[pos][prev][tight][started] = ans;
    }
}