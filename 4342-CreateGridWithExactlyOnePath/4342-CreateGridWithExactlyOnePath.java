// Last updated: 8/12/2026, 11:53:23 AM
class Solution {
    public String[] createGrid(int m, int n) {
        char [][]g=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(g[i],'#');
        }
        for(int j=0;j<n;j++){
            g[0][j]='.';
        }
        for(int i=0;i<m;i++){
            g[i][n-1]='.';
        }
        String []r=new String [m];
        for(int i=0;i<m;i++){
            r[i]=new String (g[i]);
        }
        return r;
    }
}