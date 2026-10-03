class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                // Store index of '('
                stack.push(i);
            } 
            else {
                // Remove matching '('
                stack.pop();

                if (stack.isEmpty()) {
                    // Current ')' cannot be matched
                    stack.push(i);
                } 
                else {
                    // Valid length
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }
}