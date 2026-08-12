// Last updated: 8/12/2026, 12:08:03 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // taking 2 sets - set1 and set2
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        // adding all element of nums1[] to set1
        for(int n1 : nums1){
            set1.add(n1);
        }
        // adding all element of nums2[] to set2
        for(int n2 : nums2){
            set2.add(n2);
        }
        
        if(set1.size() <= set2.size()){
            int[] result = new int[set1.size()];
            int i = 0;
            for(int n1 : set1){
                if(set2.contains(n1)){
                    result[i]=n1;
                    i++;
                }
            }
            return Arrays.copyOfRange(result,0,i);
        }
        else{
            int[] result = new int[set2.size()];
            int i = 0;
            for(int n2 : set2){
                if(set1.contains(n2)){
                    result[i]=n2;
                    i++;
                }
            }
            return Arrays.copyOfRange(result,0,i);
        }
    }
}
