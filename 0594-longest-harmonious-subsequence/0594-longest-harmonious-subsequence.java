class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;

        // Check pairs that differ by exactly 1
        for (int num : map.keySet()) {
            if (map.containsKey(num + 1)) {
                int len = map.get(num) + map.get(num + 1);
                ans = Math.max(ans, len);
            }
        }

        return ans;
    }
}