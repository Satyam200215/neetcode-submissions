class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        int size=numbers.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(numbers[i]+numbers[j]==target){
                    res[0]=i+1;
                    res[1]=j+1;
                    break;
                }
            }
        }
        return res;
    }
}
