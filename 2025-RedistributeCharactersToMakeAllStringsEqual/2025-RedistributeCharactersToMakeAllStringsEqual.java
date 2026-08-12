// Last updated: 8/12/2026, 11:55:41 AM
class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
        }

        int n = words.length;

        for (int count : freq) {
            if (count % n != 0)
                return false;
        }

        return true;
    }
}