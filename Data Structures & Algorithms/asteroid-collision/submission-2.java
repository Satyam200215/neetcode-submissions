class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res=new Stack<>();
        int size=asteroids.length;
        for(int i=0;i<size;i++){
           if(asteroids[i]>0){
            res.push(asteroids[i]);
            continue;
           }
         while(!res.isEmpty()&&res.peek()>0&&res.peek()<Math.abs(asteroids[i]))
            res.pop();
        if(!res.isEmpty()&& res.peek()==Math.abs(asteroids[i]))
            res.pop();
        else if(res.isEmpty()||res.peek()<0)
           res.push(asteroids[i]);
        }
        int[] ans =new int[res.size()];
        for(int i=ans.length-1;i>=0;i--)
           ans[i]=res.pop();

    return ans;
    }
}