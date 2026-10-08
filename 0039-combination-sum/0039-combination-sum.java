class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(
        int[] candidates,
        int target,
        int index,
        List<Integer> current,
        List<List<Integer>> ans
    ) {

        // Target achieved
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // No more elements or target exceeded
        if (index == candidates.length || target < 0) {
            return;
        }

        // Choice 1: take current number
        current.add(candidates[index]);

        // Stay at same index because we can reuse the number
        backtrack(
            candidates,
            target - candidates[index],
            index,
            current,
            ans
        );

        // Backtrack
        current.remove(current.size() - 1);

        // Choice 2: skip current number
        backtrack(
            candidates,
            target,
            index + 1,
            current,
            ans
        );
    }
}