// Last updated: 8/12/2026, 12:12:31 PM
class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String [] s= new String[n];
        for(int i=0;i<n;i++){
            s[i]=String.valueOf(nums[i]);}
            Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
            StringBuilder sb= new StringBuilder();
        for( String str:s){
                sb.append(str);
                     //String result=sb.toString();
            }
        
       String result=sb.toString();
                return result.startsWith("0")?"0":result;
    }
}