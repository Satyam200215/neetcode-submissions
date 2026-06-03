class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int window=Integer.MAX_VALUE;
        int sum=0;
        int size=nums.length;
        int count=0;
        for(int i=0;i<size;i++){
            sum=0;
            for(int j=i;j<size;j++){
                sum=sum+nums[j];
                if(sum>=target){
                    count=j-i+1;
                    window=Math.min(window,count);
                    break;
                }
            }
        }
     return window==Integer.MAX_VALUE?0:window;
    }
}