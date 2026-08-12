// Last updated: 8/12/2026, 11:59:48 AM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] n = new int[nums.length];
        int e =0;
        int o =1;
        for (int num:nums){
            if(num %2==0){
                n[e]=num;
                e+=2;
            }
            else{
               n [o]= num;
               o+=2;
            }
        }
        return n;
    }
}