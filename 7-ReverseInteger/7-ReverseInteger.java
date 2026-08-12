// Last updated: 8/12/2026, 12:19:15 PM
class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        int abs = Math.abs(x);
        int rev = 0;
        while (abs != 0) {
            int last = abs % 10;
            if (rev > (Integer.MAX_VALUE - last) / 10) {
                return 0;
            }
            rev = rev * 10 + last;
            abs /= 10;
        }
        return negative ? -rev : rev;
    }
}