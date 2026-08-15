// Last updated: 8/15/2026, 4:08:03 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer, Integer> subNum = new HashMap<>();
4        subNum.put(0, 1);
5        int total = 0, count = 0;
6
7        for (int n : nums) {
8            total += n;
9
10            if (subNum.containsKey(total - k)) {
11                count += subNum.get(total - k);
12            }
13
14            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
15        }
16
17        return count;        
18    }
19}