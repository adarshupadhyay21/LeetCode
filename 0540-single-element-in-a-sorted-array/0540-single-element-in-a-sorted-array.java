class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct → single is on the right
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } 
            // Pair is broken → single is on the left
            else {
                end = mid;
            }
        }

        return nums[start];
    }
}