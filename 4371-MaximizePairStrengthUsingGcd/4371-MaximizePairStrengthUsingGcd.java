// Last updated: 8/12/2026, 11:53:01 AM
class Solution {
    public long maxPairStrength(int[] nums) {
        long st=0;
        long val=0;
        for(int num:nums){
            val=Math.max(val,num);
        }
        int [] c=new int[(int)val+1];
        for(int  num:nums){
            c[num]++;
        }
        for(int g=1;g<=val;g++){
            java.util.List<Integer> dx=new java.util.ArrayList<>();
            for(int x=1;g*x<=val;x++){
                if(c[g*x]>0){
                    dx.add(x);
                    if(c[g*x]>1){
                        dx.add(x);
                    }
                }
            }
            for(int i=dx.size()-1;i>=0;i--){
                long x = dx.get(i);
                if(x*x<=st){
                    break;
                }
                for(int j=i-1;j>=0;j--){
                    long y=dx.get(j);
                    if(x*y<=st){
                        break;
                    }
                    long gcdxy=gcd(x,y);
                    long cst=(x*y)/(gcdxy*gcdxy);
                    st=Math.max(st,cst);
                }
            }
        }
        return st;
    }
    private long gcd(long a ,long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
}