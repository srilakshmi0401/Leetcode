// Last updated: 8/12/2026, 11:53:22 AM
class Solution {
    public static final int MOD=1000000007;
    public int countValidSequences(int n, int k) {
        if(n<k) return 0;
        long tq =nCr(n-1,k-1);
        long ow=0;
        if((n-k)%2==0){
            int m = (n-k)/2;
            ow=nCr(m+k-1,k-1);
        }
            long ans = (tq-ow+MOD)%MOD;
            return (int )ans;
        }
        private long nCr(int n ,int r){
            if(r<0||r>n) return 0;
            if(r==0||r==n) return 1;
            if(r>n-r) r=n-r;
            long num=1;
            long dem =1;
            for(int i=0;i<r;i++){
                num=(num*(n-i))%MOD;
                dem=(dem*(i+1))%MOD;
            }
            return (num*modInverse(dem,MOD))%MOD;
            
        }
    private long modInverse(long n, int mod){
        return power (n,mod-2,mod);
    }
        private long power(long base,int exp,int mod){
            long res =1;
            base = base%mod;
            while(exp>0){
                if((exp&1)==1) res=(res*base)%mod;
                base = (base *base)%mod;
                exp>>=1;
            }
            return res;
        }
    
}