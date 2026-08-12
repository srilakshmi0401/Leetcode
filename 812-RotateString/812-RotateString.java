// Last updated: 8/12/2026, 12:01:24 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}