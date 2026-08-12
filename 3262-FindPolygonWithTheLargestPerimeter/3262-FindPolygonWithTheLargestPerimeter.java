// Last updated: 8/12/2026, 11:54:49 AM
class Solution {
    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        long sum = 0;

        for (int x : nums) {
            sum += x;
        }

        for (int i = nums.length - 1; i >= 2; i--) {

            if (sum - nums[i] > nums[i]) {
                return sum;
            }

            sum -= nums[i];
        }

        return -1;
    }
}