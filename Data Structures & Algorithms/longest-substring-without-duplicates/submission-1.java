class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl=0;
        Set<Character> res=new HashSet<>();
        int left=0;
        int size=s.length();
        for(int right=0;right<size;right++)
        {
            while(res.contains(s.charAt(right))){
                res.remove(s.charAt(left));
                left++;
            }
            res.add(s.charAt(right));
            maxl=Math.max(maxl,right-left+1);
        }
        return maxl;
    }
}
