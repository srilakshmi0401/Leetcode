// Last updated: 8/15/2026, 4:09:27 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l =0;
4        int m =0;
5        HashSet<Character> charSet= new HashSet<>();
6        for(int r =0;r<s.length();r++){
7            while(charSet.contains(s.charAt(r))){
8                charSet.remove(s.charAt(l));
9                l++;
10            }
11            charSet.add(s.charAt(r));
12            m=Math.max(m,r-l+1);
13        }
14        return m;
15    }
16}