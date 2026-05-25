class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size=temperatures.length;
        int[] ans=new int[size];
        Stack<Integer> res=new Stack<>();
        for(int i=0;i<size;i++){
            while(!res.isEmpty()&&temperatures[i]>temperatures[res.peek()])
            {
                int prev=res.pop();
                ans[prev]=i-prev;
            }
            res.push(i);
        }
        return ans;
    }
}
