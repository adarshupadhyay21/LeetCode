class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Find maximum element in current row
            int maxCol = 0;

            for (int col = 1; col < cols; col++) {
                if (mat[mid][col] > mat[mid][maxCol]) {
                    maxCol = col;
                }
            }

            // Value above current element
            int up = (mid > 0) ? mat[mid - 1][maxCol] : -1;

            // Value below current element
            int down = (mid < rows - 1) ? mat[mid + 1][maxCol] : -1;

            // Current element is greater than both
            if (mat[mid][maxCol] > up &&
                mat[mid][maxCol] > down) {

                return new int[]{mid, maxCol};
            }

            // Bigger element is below
            if (down > mat[mid][maxCol]) {
                low = mid + 1;
            }

            // Bigger element is above
            else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}