class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(
        int index,
        int[] nums,
        List<Integer> current,
        List<List<Integer>> ans
    ) {

        // Add current subset to answer
        ans.add(new ArrayList<>(current));

        // Try every possible next element
        for (int i = index; i < nums.length; i++) {

            // Take nums[i]
            current.add(nums[i]);

            // Move forward
            backtrack(i + 1, nums, current, ans);

            // Backtrack: remove the element
            current.remove(current.size() - 1);
        }
    }
}