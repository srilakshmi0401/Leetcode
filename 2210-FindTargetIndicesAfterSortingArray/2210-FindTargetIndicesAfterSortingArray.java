// Last updated: 8/12/2026, 11:55:20 AM
import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int n = nums.length;

        // Selection Sort
        for(int i = 0; i < n - 1; i++) {

            int min = i;

            for(int j = i + 1; j < n; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                ans.add(i);
            }
        }

        return ans;
    }
}