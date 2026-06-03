class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> res=new HashSet<>();
        int left=0;

        for(int i=0;i<nums.length;i++){
            if(i-left>k){
                res.remove(nums[left]);
                left++;
            }
            if(res.contains(nums[i]))
               return true;
        
        res.add(nums[i]);
        }
    return false;
    }
}