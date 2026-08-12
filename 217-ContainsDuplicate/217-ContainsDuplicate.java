// Last updated: 8/12/2026, 12:10:29 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]){
                    return true;
                }
            
        }
        return false;
        
    }
}