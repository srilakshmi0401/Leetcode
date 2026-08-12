// Last updated: 8/12/2026, 12:09:32 PM
class Solution {
    public boolean isAnagram(String s, String t) {
       
        char [] a=s.toCharArray();
        char [] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return (Arrays.equals(a,b));
    }
}