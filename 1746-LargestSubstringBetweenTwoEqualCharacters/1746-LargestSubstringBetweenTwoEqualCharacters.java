// Last updated: 8/12/2026, 11:55:58 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] first = new int[26];
        Arrays.fill(first, -1);

        int ans = -1;

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            if (first[idx] == -1)
                first[idx] = i;
            else
                ans = Math.max(ans, i - first[idx] - 1);
        }

        return ans;
    }
}