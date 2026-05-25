class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();
        
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                return false;
            }
        }
        return stack.isEmpty();
    }
}