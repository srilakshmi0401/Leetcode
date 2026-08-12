// Last updated: 8/12/2026, 12:19:32 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int l=nums.length;
       for(int i=0;i<l;i++){
        for(int j=i+1;j<l;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
       }
       return new int[0];
    }
}