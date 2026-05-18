class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> res=new HashMap<>();
        for(int i:nums){
            res.put(i,res.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(res.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());
        int size=list.size();
        int j=size-1;
       while(k>0){
          ans[k-1]=list.get(j).getKey();
          k--;
          j--;
       }
       return ans;
    }
}