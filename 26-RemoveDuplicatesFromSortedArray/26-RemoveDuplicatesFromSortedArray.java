// Last updated: 8/12/2026, 12:18:02 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int i=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}