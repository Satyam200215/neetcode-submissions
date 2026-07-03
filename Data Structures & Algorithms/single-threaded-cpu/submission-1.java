class Solution {
    public int[] getOrder(int[][] tasks) {
        int n=tasks.length;
        int[] res=new int[n];

        int[][] sortedTasks=new int[n][3];

        for(int i=0;i<n;i++){
            sortedTasks[i][0]=tasks[i][0];
            sortedTasks[i][1]=tasks[i][1];
            sortedTasks[i][2]=i;
        }

        Arrays.sort(sortedTasks,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])
               return Integer.compare(a[1],b[1]);
         return Integer.compare(a[2],b[2]);
        });

        int ti=0;
        int ri=0;
        long ct=0;
        while(ti<n || !pq.isEmpty()){
        
        if(pq.isEmpty() && ct<sortedTasks[ti][0]){
            ct=sortedTasks[ti][0];
        }

        while(ti<n && sortedTasks[ti][0]<=ct){
            pq.add(sortedTasks[ti]);
            ti++;
        }
        int[] currentTask=pq.poll();
        res[ri++]=currentTask[2];
        ct=ct+currentTask[1];
    }
    return res;
    }
}