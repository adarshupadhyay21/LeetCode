// class Solution {
//     public long maximumTripletValue(int[] nums) {
//         int n = nums.length;
//         int ans = 0;
//         int max = -1;
//         for(int i=0;i<n-2;i++){
//             for(int j = i+1;j<n-1;j++){
//                 for(int k = i+2;k<n;k++){
//                     ans = (nums[i]-nums[j])*nums[k];
//                     if(max<= ans){
//                         max = ans;
//                     }
//                 }
//             }
//         }
//         if(max < 0 ){
//             return 0;
//         }
//         return max;
//     }
// }

class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0; // Use long to avoid overflow

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {  // j+1 instead of i+2
                    long value = (long)(nums[i] - nums[j]) * nums[k]; // Use long for calculation
                    max = Math.max(max, value);
                }
            }
        }
        
        return max;
    }
}
