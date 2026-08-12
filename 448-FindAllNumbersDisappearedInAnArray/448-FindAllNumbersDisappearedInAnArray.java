// Last updated: 8/12/2026, 12:06:38 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean [] p = new boolean [nums.length+1];
        for (int num :nums){
            p[num]=true;
        }
        List<Integer> a = new ArrayList<>();
        for(int i =1;i<=nums.length;i++){
            if(!p[i]){
                a.add(i);
            }
        }
        return a;
    }
}