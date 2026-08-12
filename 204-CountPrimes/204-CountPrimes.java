// Last updated: 8/12/2026, 12:10:47 PM
class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int cnt=0;
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2;i < n; i++) {
            if (prime[i]) {
                cnt++;
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return cnt;
    }
}