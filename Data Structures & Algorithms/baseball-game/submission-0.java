public class Solution {
    public int calPoints(String[] ops) {
        int res = 0;
        Stack<Integer> ans = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = ans.pop();
                int newTop = top + ans.peek();
                ans.push(top);
                ans.push(newTop);
                res += newTop;
            } else if (op.equals("D")) {
                ans.push(2 * ans.peek());
                res += ans.peek();
            } else if (op.equals("C")) {
                res -= ans.pop();
            } else {
                ans.push(Integer.parseInt(op));
                res += ans.peek();
            }
        }
        return res;
    }
}