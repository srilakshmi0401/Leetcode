// Last updated: 8/12/2026, 12:14:09 PM
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int n:nums){
            ans^=n;
        }
        return ans;
    }
}