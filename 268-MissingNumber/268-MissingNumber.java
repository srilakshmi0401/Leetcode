// Last updated: 8/12/2026, 12:09:01 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ex = n*(n+1)/2;
        int ac =0;
        for (int num:nums){
            ac +=num;
        }
        return ex- ac;
    }
}