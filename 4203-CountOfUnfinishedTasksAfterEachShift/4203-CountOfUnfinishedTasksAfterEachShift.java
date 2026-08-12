// Last updated: 8/12/2026, 11:53:39 AM
class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        int [] ans = new int[m];
        long []p= new long[n+1];
        for(int i=0;i<n;i++){
            p[i+1]=p[i]+tasks[i];
        }
        int currentTaskIdx=0;
        long currentTaskRem =tasks[0];
        for(int j =0;j<m;j++){
            long shiftTime=shifts[j];
            if(shiftTime<currentTaskRem){
                currentTaskRem -=shiftTime;
                ans[j]=n-currentTaskIdx;
                continue;
            }
            shiftTime -= currentTaskRem;
            currentTaskIdx++;
            if(currentTaskIdx==n){
                ans[j]=0;
                currentTaskIdx=0;
                currentTaskRem = tasks[0];
                continue;
            }
            long targetSum =p[currentTaskIdx]+shiftTime;
            int idx = Arrays.binarySearch(p,targetSum);
            if(idx<0){
                idx= -idx-2;
            }
            shiftTime -=(p[idx]-p[currentTaskIdx]);
            currentTaskIdx=idx;
            if(currentTaskIdx==n){
                ans[j]=0;
                currentTaskIdx=0;
                currentTaskRem= tasks[0];
                
            }
            else{
                currentTaskRem = tasks[currentTaskIdx]-shiftTime;
                ans[j]=n-currentTaskIdx;
            }
        }
        return ans;
    }
}