class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        // Maximum possible divisor
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            for (int num : nums) {
                // ceil(num / mid)
                sum += (num + mid - 1) / mid;
            }

            if (sum <= threshold) {
                // mid works, but try a smaller divisor
                ans = mid;
                high = mid - 1;
            } else {
                // sum is too large, need a larger divisor
                low = mid + 1;
            }
        }

        return ans;
    }
}