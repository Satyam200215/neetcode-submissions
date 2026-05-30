class Solution {
    public int majorityElement(int[] nums) {
        int size=nums.length;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()> (size/2))
                return(entry.getKey());
        }
        return -1;
    }
}
    