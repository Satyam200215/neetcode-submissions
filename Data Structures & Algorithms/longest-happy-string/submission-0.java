class Solution {
    public String longestDiverseString(int a, int b, int c) {
        class CharInfo{
            int freq;
            char ch;
            int index;

            CharInfo(int freq,char ch,int index){
                this.freq=freq;
                this.ch=ch;
                this.index=index;
            }
        }

        PriorityQueue<CharInfo> pq=new PriorityQueue<>((d,e)->e.freq-d.freq);

        if(a>0) 
          pq.add(new CharInfo(a,'a',0));
        if(b>0)
          pq.add(new CharInfo(b,'b',1));
        if(c>0)
          pq.add(new CharInfo(c,'c',2));

    StringBuilder res=new StringBuilder();

      while(!pq.isEmpty()){
          CharInfo first=pq.poll();
          int len=res.length();

          if(len>=2 && res.charAt(len-1)==first.ch && res.charAt(len-2)==first.ch)
          {

               if(pq.isEmpty())
                  break;
            
            CharInfo second=pq.poll();
            res.append(second.ch);
            second.freq--;

            if(second.freq>0)
               pq.add(second);

            pq.add(first);
          }
          else{
            res.append(first.ch);
            first.freq--;

            if(first.freq>0){
                pq.add(first);
            }
          }
      }
    return res.toString();
    }
}