class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window=Integer.MAX_VALUE;
        int sum=0;
        int size=nums.length;
        int left=0;
        for(int i=0;i<size;i++){
            sum+=nums[i];

            while(sum>=target){
                window=Math.min(window,i-left+1);
                sum-=nums[left];
                left++;
            }
        }
    return window==Integer.MAX_VALUE?0:window;
    }
}