// Last updated: 8/12/2026, 12:08:59 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int l =nums.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(nums[j]==0&&nums[j+1]!=0){
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        for(int b:nums){
            System.out.print(b+" ");
        }
        
    }
}