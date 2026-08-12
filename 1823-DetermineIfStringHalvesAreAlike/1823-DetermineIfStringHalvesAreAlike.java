// Last updated: 8/12/2026, 11:55:53 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";

        int left = 0, right = 0;
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1)
                left++;

            if (vowels.indexOf(s.charAt(i + n / 2)) != -1)
                right++;
        }

        return left == right;
    }
}