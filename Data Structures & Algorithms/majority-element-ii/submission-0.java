class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size=nums.length;
        List<Integer> al = new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue()> (size/3))
                al.add(entry.getKey());
        }
        return al;
    }
}