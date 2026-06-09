class Solution {
    public boolean search(int[] nums, int target) {
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]==target)
              return true;
        }
    return false;
    }
}