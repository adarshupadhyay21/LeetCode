class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxK = -1;

        for (int num : nums) {
            if (set.contains(-num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }
            set.add(num);
        }
        return maxK;
    }
}
