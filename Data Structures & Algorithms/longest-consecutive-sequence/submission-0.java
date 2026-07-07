class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        int size=nums.length;
        for(int i=0;i<size;i++)
        {
            if(!hs.contains(nums[i]))
               hs.add(nums[i]);
        }
       
    for(int num:hs){
         if(!hs.contains(num-1))
         {
            int curr=num;
            int streak=1;

            while(hs.contains(curr+1)){
                curr=curr+1;
                streak=streak+1;
            }
            count=Math.max(count,streak);
         }
    }
       return count;
    }
}
