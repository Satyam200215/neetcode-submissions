class Solution {
    public int evalRPN(String[] tokens) {
        int size=tokens.length;
        Stack<Integer> ans=new Stack<>();
       for(int i=0;i<size;i++){
           if(tokens[i].equals("+"))
           {
             int op2=ans.pop();
             int op1=ans.pop();
             int res=op1+op2;
             ans.push(res);
           }
          else if(tokens[i].equals("-"))
           {
             int op2=ans.pop();
             int op1=ans.pop();
             int res=op1-op2;
             ans.push(res);
           }
           else if(tokens[i].equals("*"))
           {
             int op2=ans.pop();
             int op1=ans.pop();
             int res=op1*op2;
             ans.push(res);
           }
           else if(tokens[i].equals("/"))
           {
             int op2=ans.pop();
             int op1=ans.pop();
             int res=op1/op2;
             ans.push(res);
           }
         else{
             ans.push(Integer.parseInt(tokens[i]));
         } 
       }
       return ans.peek();
    }
}
