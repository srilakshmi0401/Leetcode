// Last updated: 8/12/2026, 11:54:31 AM
class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // Frequency of each number
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }

        // exactPairs[g] = number of pairs whose GCD is exactly g
        long[] exactPairs = new long[max + 1];

        for (int g = max; g >= 1; g--) {

            long count = 0;

            // Count numbers divisible by g
            for (int multiple = g; multiple <= max; multiple += g) {
                count += freq[multiple];
            }

            // Total pairs divisible by g
            exactPairs[g] = count * (count - 1) / 2;

            // Remove pairs already counted for multiples
            for (int multiple = g * 2; multiple <= max; multiple += g) {
                exactPairs[g] -= exactPairs[multiple];
            }
        }

        // Prefix sums
        long[] prefix = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exactPairs[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            long target = queries[i] + 1;

            int left = 1;
            int right = max;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (prefix[mid] >= target)
                    right = mid;
                else
                    left = mid + 1;
            }

            ans[i] = left;
        }

        return ans;
    }
}