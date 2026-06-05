class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res=new Stack<>();
        int size=asteroids.length;
        for(int i=0;i<size;i++){
            boolean exploded=false;
        while(!res.isEmpty()&&res.peek()>0 && asteroids[i]<0){
            if(res.peek()<Math.abs(asteroids[i])){
                res.pop();
                continue;
            }
            else if(res.peek()==Math.abs(asteroids[i])){
                res.pop();
                exploded=true;
                break;
            }
            else{
                exploded=true;
                break;
            }
        }
         if(!exploded)
             res.push(asteroids[i]);

        }
        int[] ans =new int[res.size()];
        for(int i=ans.length-1;i>=0;i--)
           ans[i]=res.pop();

    return ans;
    }
}