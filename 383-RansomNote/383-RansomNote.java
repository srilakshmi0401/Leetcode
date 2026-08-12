// Last updated: 8/12/2026, 12:07:43 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq= new int[26];
        for(char c :magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c :ransomNote.toCharArray()){
            freq[c-'a']--;
            if(freq[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}