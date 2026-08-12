// Last updated: 8/12/2026, 11:53:02 AM
class Solution {
    public int maximumWidth(int[] planks) {
     Map<Integer,Integer>countMap=new HashMap<>();
        for(int plank:planks){
            countMap.put(plank,countMap.getOrDefault(plank,0)+1);
        }
        List <Integer> uniquePlanks= new ArrayList<>(countMap.keySet());
        int uSize=uniquePlanks.size();
        Map<Integer,Integer> pairSumMap=new HashMap<>();
        for(int x:uniquePlanks){
            int cnt=countMap.get(x);
            if(cnt>=2){
                pairSumMap.put(2*x,pairSumMap.getOrDefault(2*x,0)+cnt/2);
            }
        }
        for(int i=0;i<uSize;i++){
            int x =uniquePlanks.get(i);
            int countX=countMap.get(x);
            for(int j=i+1;j<uSize;j++){
                int y = uniquePlanks.get(j);
                int countY=countMap.get(y);
                int targetH=x+y;
                int possiblePairs=Math.min(countX,countY);
                pairSumMap.put(targetH,pairSumMap.getOrDefault(targetH,0)+possiblePairs);
            }
        }
        int maxWidth=0;
        for(int targetH:pairSumMap.keySet()){
            int totalPlanks=pairSumMap.get(targetH)+countMap.getOrDefault(targetH,0);
            maxWidth=Math.max(maxWidth,totalPlanks);
        }
        for(int count:countMap.values()){
            maxWidth=Math.max(maxWidth,count);
        }
        return maxWidth;
    }
}