// Last updated: 8/12/2026, 11:54:39 AM
class Solution {
    public int countKeyChanges(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1)))
                count++;
        }

        return count;
    }
}