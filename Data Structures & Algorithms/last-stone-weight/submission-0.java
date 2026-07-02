class Solution {
    public int lastStoneWeight(int[] stones) {
        int size=stones.length;

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<size;i++)
              pq.add(stones[i]);

        while((pq.size()>=2)){
            int ele1=pq.poll();
            int ele2=pq.poll();

            if(ele1!=ele2){
                int diff=ele1-ele2;
                pq.add(diff);
            }
            
        }
    return pq.isEmpty()?0:pq.peek();
    }
}
