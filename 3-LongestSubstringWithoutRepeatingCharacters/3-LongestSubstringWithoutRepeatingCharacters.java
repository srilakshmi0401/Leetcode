// Last updated: 8/12/2026, 12:19:22 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int m =0;
        HashSet<Character> charSet= new HashSet<>();
        for(int r =0;r<s.length();r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove(s.charAt(l));
                l++;
            }
            charSet.add(s.charAt(r));
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}