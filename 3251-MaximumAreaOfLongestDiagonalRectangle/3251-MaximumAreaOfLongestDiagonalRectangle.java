// Last updated: 8/12/2026, 11:54:51 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int md=0;
        int ma=0;
        for(int []r:dimensions){
            int l =r[0];
            int w = r[1];
            int d =l*l+w*w;
            int a =l*w;
            if(d>md){
                md =d;
                ma=a;
            }
            else if(d==md){
                ma =Math.max(ma,a);
            }
        }
        return ma;
    }
}