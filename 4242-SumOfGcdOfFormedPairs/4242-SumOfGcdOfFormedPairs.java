// Last updated: 8/12/2026, 11:53:37 AM
class Solution {
    public long gcdSum(int[] nums) {
        int n =nums.length;
        int pg[]=new int [n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            pg[i]=gcd(nums[i],max);
        }
        Arrays.sort(pg);
        long ans=0;
        int l=0;
        int r =n-1;
        while(l<r){
            ans+=gcd(pg[l],pg[r]);
            l++;
            r--;
        }
        return ans;
        
    }
    private int gcd(int a,int b){
       while(b!=0) {int t =a%b;
        a=b;
        b=t;     }
        return a;
}
}