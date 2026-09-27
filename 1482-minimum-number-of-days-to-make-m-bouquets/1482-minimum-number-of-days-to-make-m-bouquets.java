class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // If total flowers required are more than available flowers
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find minimum and maximum bloom day
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {

                // Possible answer
                ans = mid;

                // Try to find a smaller day
                high = mid - 1;

            } else {

                // Need more days
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMakeBouquets(
            int[] bloomDay, int m, int k, int day) {

        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {

            // Flower has bloomed
            if (bloom <= day) {
                flowers++;

                // We have k consecutive flowers
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {

                // Consecutiveness breaks
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}