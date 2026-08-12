// Last updated: 8/12/2026, 11:53:45 AM
class Solution {
      List<Integer>[]tree;
        int [] baseTime;
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        Object torqavemi= new Object[]{n,edges,baseTime};
        this.baseTime = baseTime;
        tree = new ArrayList[n];
        for(int i =0;i<n;i++){
            tree[i]= new ArrayList<>();
        }
        for(int []e:edges){
            tree[e[0]].add(e[1]);
        }
        return dfs(0);
    }
    private long dfs(int node){
        if(tree[node].isEmpty()){
            return baseTime[node];
        }
        long ear=Long.MAX_VALUE;
        long la = Long.MIN_VALUE;
        for(int child:tree[node]){
            long cf = dfs(child);
            ear =Math.min(ear,cf);
            la= Math.max(la,cf);
        }
        long Own = (la-ear)+baseTime[node];
        return la+Own;
    }
}