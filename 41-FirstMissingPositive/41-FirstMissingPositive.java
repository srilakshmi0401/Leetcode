// Last updated: 8/12/2026, 12:17:14 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(filteredNums);
        
        int target = 1;
        for (int n : filteredNums) {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        
        return target;        
    }
}