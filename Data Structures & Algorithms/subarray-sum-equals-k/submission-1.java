class Solution {
    public int subarraySum(int[] nums, int k) {
        int size=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<size;i++){
            sum=0;
            for(int j=i;j<size;j++){
                sum+=nums[j];
                if(sum==k)
                   count++;
                
            }
        }
        return count;
    }
}