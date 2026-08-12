// Last updated: 8/12/2026, 11:55:09 AM
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        while(left<=right){
            String s = words[left];
            char st= s.charAt(0);
            char en=s.charAt(s.length(
                
            )-1);
            if((st=='a'||st=='e'||st=='i'||st=='o'||st=='u')&&(en=='a'||en=='e'||en=='i'||en=='o'||en=='u')){
                c++;
            }
            left++;
        }
        return c;
    }
}