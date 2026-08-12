// Last updated: 8/12/2026, 11:56:34 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }
            else if(i > max2){
                max2 = i;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}