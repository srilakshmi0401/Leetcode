// Last updated: 8/12/2026, 12:08:49 PM
class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++)
            sum += nums[i];

        return sum;
    }
}