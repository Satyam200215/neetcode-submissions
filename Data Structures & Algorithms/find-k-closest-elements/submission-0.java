class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> al = new ArrayList<>();
        int size=arr.length;

         for(int i=0;i<size;i++){
            al.add(arr[i]);
         }
       
       Collections.sort(al,(a,b)->{
        int diffA=Math.abs(a-x);
        int diffB=Math.abs(b-x);

        if(diffA!=diffB){
           return diffA-diffB;
       }
       return a-b;
    });
        List<Integer> res=new ArrayList<>(al.subList(0,k));

        Collections.sort(res);

        return res;
    }
}