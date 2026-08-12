// Last updated: 8/12/2026, 11:57:54 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int s =0;
        for(int i =0;i<nums.length;i+=2){
            s+=nums[i];
        }
        int [] ans = new int [s];
        int index=0;
        for(int i=0;i<nums.length;i+=2){
            int freq= nums[i];
            int val = nums[i+1];
        
        for (int j =0;j<freq;j++){
            ans[index++]=val;
        }
    }
    
    return ans;
}
}