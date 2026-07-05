class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
         int size=trips.length;

         int[] res=new int[1001];          
         for(int i=0;i<size;i++){
             int passengers=trips[i][0];
             int from=trips[i][1];
             int to=trips[i][2];

             res[from]+=passengers;
             res[to]-=passengers;
         }

         int curr=0;
         for(int i=0;i<res.length;i++){
            curr=curr+res[i];
            if(curr>capacity)
               return false;
         }
  return true;
    }
}