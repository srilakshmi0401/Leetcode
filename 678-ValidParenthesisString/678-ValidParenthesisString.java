// Last updated: 8/12/2026, 12:02:58 PM
class Solution {
    public boolean checkValidString(String s) {
        int lm=0,lmax=0;
        for(char c :s.toCharArray()){
            if(c=='('){
                lm++;
                lmax++;
            }
            else if(c==')'){
                lm--;
                lmax--;
            }
            else{
                lm--;
                lmax++;
            }
            if(lmax<0) return false;
            if(lm<0) lm=0;
        }
        return lm==0;
    }
}