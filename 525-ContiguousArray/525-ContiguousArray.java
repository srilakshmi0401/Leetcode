// Last updated: 8/12/2026, 12:05:44 PM
class Solution {
    public int findMaxLength(int[] nums) {

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                sum--;
            else
                sum++;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}