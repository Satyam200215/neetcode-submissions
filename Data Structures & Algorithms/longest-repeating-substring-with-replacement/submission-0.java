class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> hm=new HashMap<>();
            int freq=0;
            for(int j=i;j<s.length();j++){
                hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
                freq=Math.max(freq,hm.get(s.charAt(j)));

                if((j-i+1)-freq<=k)
                    ans=Math.max(ans,(j-i+1));
            }
        }
        return ans;
    }
}
