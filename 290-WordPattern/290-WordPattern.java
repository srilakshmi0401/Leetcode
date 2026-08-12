// Last updated: 8/12/2026, 12:08:54 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i =0;i<pattern.length();i++){
            if(pattern.indexOf(pattern.charAt(i))!=firstIndex(words,words[i])){
                return false;
            }
        }
            return true;
    }
    public int firstIndex(String[] words,String target){
        for(int i =0;i<words.length;i++){
            if(words[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}