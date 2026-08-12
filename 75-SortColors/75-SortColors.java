// Last updated: 8/12/2026, 12:15:52 PM
class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j+1]<a[j]){
                    int t= a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int nums :a){
            System.out.print(nums+" ");
        }
    }
}