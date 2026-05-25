class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] ans=new int[size];
        ans[size-1]=0;
        int count=0;
        for(int i=0;i<size-1;i++){
            count=0;
            for(int j=i+1;j<size;j++){
                count++;
                if(temperatures[j]>temperatures[i]){
                   ans[i]=count;
                   break;
                }
                else{
                    ans[i]=0;
                }
            }
        }
        return ans;
        
    }
}
