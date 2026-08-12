// Last updated: 8/12/2026, 11:54:55 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {

        int maxFreq = 0;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                total = count;
            } else if (count == maxFreq) {
                total += count;
            }
        }

        return total / maxFreq;
    }
}