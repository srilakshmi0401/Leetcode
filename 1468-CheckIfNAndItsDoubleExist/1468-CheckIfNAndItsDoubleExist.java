// Last updated: 8/12/2026, 11:56:56 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target && mid != i) 
                    return true;
                if (arr[mid] < target) 
                    lo = mid + 1;
                else 
                    hi = mid - 1;
            }
        }

        return false;
    }
}

// TC: O(n * logn), SC: O(1)