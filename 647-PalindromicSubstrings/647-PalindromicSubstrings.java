// Last updated: 8/12/2026, 12:03:10 PM
class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);       // Odd length
            count += expand(s, i, i + 1);   // Even length
        }

        return count;
    }

    private int expand(String s, int left, int right) {
        int cnt = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }

        return cnt;
    }
}