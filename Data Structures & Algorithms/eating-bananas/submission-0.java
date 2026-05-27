class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int size=piles.length;
        int low=1;
        int high=piles[size-1];

        int res=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            long totalhours=0;

            for(int i=0;i<size;i++)
               totalhours=totalhours+(piles[i]+mid-1)/mid;

            if(totalhours<=h){
                res=mid;
                high=mid-1;
            }
            else
               low=mid+1;
        }
        return res;
    }
}
