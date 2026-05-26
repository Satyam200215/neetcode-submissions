class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> ans=new Stack<>();
        int size=position.length;
        int[][] cars=new int[size][2];
        for(int i=0;i<size;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->Integer.compare(b[0],a[0]));

        int n=cars.length;

        for(int i=0;i<n;i++){
            double time=(double)(target-cars[i][0])/cars[i][1];
             if(ans.isEmpty()||time>ans.peek())
                ans.push(time);
          }
        return ans.size();
    }
}
