// Last updated: 8/12/2026, 11:53:19 AM
class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n =monsters.length;
        long[] totalBoosts=new long[n];
        long [] diff= new long[n+1];
        for(int [] b :boosts){
            int start = b[0];
            int end = b[1];
            long val =b[2];
            diff[start]+=val;
            if(end+1<=n){
                diff[end+1]-=val;
            }
        }
        long runningBoost=0;
        for(int i=0;i<n;i++){
            runningBoost +=diff[i];
            totalBoosts[i]= runningBoost;
        }
        long low=0;
        long high=0;
        for(int m :monsters){
            high+=m;
        }
        long ans = high;
        while(low <=high){
            long mid = low+(high-low)/2;
            if(canDefeatAll(mid,monsters,totalBoosts)){
                ans = mid;
                high= mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    private boolean canDefeatAll(long strength,int [] monsters,long[]totalBoosts){
        long current =strength;
        for(int i=0;i<monsters.length;i++){
            if(current+totalBoosts[i]<monsters[i]){
                return false;
            }
            current = Math.max(0,current -monsters[i]);
        }
        return true;
    }
}