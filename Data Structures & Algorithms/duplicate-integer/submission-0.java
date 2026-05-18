class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res=new HashSet<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(res.contains(nums[i]))
               return true;
            else
               res.add(nums[i]);
        }
        return false;
    }
}