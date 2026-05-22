class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hm1=new HashMap<>();
        for(char c: s1.toCharArray())
           hm1.put(c,hm1.getOrDefault(c,0)+1);
        
        int size=hm1.size();

        for(int i=0;i<s2.length();i++){
            Map<Character,Integer> hm2=new HashMap<>();
            int cur=0;
            for(int j=i;j<s2.length();j++){
                char c=s2.charAt(j);
                hm2.put(c,hm2.getOrDefault(c,0)+1);

                if(hm1.getOrDefault(c,0)<hm2.get(c))
                  break;
                if(hm1.getOrDefault(c,0)==hm2.get(c))
                  cur++;

                if(cur==size)
                   return true;
            }
        }
        return false;
    }
}
