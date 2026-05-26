class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int size=nums.length;
        int high=size-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
               return mid;
            else if(nums[mid]>target)
               high=mid-1;
            else
               low=mid+1;
        }
        return -1;
    }
}
