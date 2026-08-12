// Last updated: 8/12/2026, 12:11:37 PM
class Solution {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<32;i++){
            ans<<=1;
            ans|=(n&1);
            n>>=1;
        }
        return ans;
    }
}