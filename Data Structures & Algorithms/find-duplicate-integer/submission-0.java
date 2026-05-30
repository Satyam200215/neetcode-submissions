class Solution {
    public int findDuplicate(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            if(res.contains(nums[i]))
               return nums[i];
            else
                res.add(nums[i]);
        }
        return -1;
    }
}
