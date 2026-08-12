// Last updated: 8/12/2026, 12:02:35 PM
class Solution {
    public int pivotIndex(int[] nums) {
        int ts =0;
        for (int num :nums){
            ts +=num;
        }
        int ls =0;
        for (int i =0;i<nums.length;i++){
            int rs = ts-ls-nums[i];
            if(rs ==ls){
                return i;
            }
            ls +=nums[i];
        }
        return -1;
    }
}