class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int size=nums.length;

        for(int i=0;i<size;i++)
            pq.add(nums[i]);

        int count=0;
        int ans=0;
        while(!(pq.isEmpty())){
            count++;
            if(count==k)
            {
                ans=pq.peek();
                break;
            }
            pq.poll();
        }
    return ans;
    }
}
