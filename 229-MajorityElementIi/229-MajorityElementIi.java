// Last updated: 8/12/2026, 12:09:56 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        // Check frequency
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
}