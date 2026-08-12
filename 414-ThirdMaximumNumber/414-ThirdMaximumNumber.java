// Last updated: 8/12/2026, 12:07:02 PM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int c =1;
        int max = nums[nums.length-1];
        for(int i =nums.length-2;i>=0;i--){
            if(nums[i]!=nums[i+1]){
                c++;
                if(c==3){
                    return nums[i];
                }
            }
        }
        return max;
        
    }
}