class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        backtrack("", 0, 0, n, ans);

        return ans;
    }

    private void backtrack(
            String s,
            int open,
            int close,
            int n,
            List<String> ans) {

        // We have used all n pairs
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        // We can add '(' if we haven't used all of them
        if (open < n) {
            backtrack(
                s + "(",
                open + 1,
                close,
                n,
                ans
            );
        }

        // We can add ')' only if there is an unmatched '('
        if (close < open) {
            backtrack(
                s + ")",
                open,
                close + 1,
                n,
                ans
            );
        }
    }
}