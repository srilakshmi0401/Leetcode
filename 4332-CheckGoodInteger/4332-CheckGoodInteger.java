// Last updated: 8/12/2026, 11:53:25 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int d=0;
        int s=0;
        while(n>0){
             int  di=n%10;
            d+=di;
            s+=di*di;
            n/=10;
        }
        return (s-d)>=50;
    }
}