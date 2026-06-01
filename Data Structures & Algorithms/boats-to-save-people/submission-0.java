class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int size=people.length;
        int left=0;
        int right=size-1;
        while(left<=right)
        {   
            
            int diff=limit-people[right--];
            boats++;
            if(left<=right && diff>=people[left])
                left++;

        }
    return boats;
    }
}