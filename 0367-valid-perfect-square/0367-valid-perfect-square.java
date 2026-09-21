class Solution {
    public boolean isPerfectSquare(int num) {

        int low = 0;
        int high = num;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long temp = (long) mid * mid;

            if (temp == num) {
                return true;
            } 
            else if (temp > num) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}