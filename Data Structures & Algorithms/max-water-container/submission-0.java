class Solution {
    public int maxArea(int[] heights) {
        int size=heights.length;
        int i=0;
        int j=size-1;
        int max=Integer.MIN_VALUE;
        while(i<j){
            int small=Math.min(heights[i],heights[j]);
            max=Math.max(max,small*(j-i));
            if(heights[i]<heights[j])
               i++;
            else
               j--;
        }
        return max;
    }
}
