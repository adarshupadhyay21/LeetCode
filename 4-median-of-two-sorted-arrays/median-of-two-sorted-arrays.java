class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[] =new int [n+m];
        int index = 0;
        int i =0;
        int j =0; 
    
        while(i<n&&j<m){
            if(nums1[i] <  nums2[j]){
                arr[index] = nums1[i];
                i++;
                index++;
            }
            else{
                arr[index] = nums2[j];
                j++;
                index++;
            }
        }
        while(i<n){
            arr[index] = nums1[i];
            i++;
            index++;
        }
        while(j<m){
            arr[index] = nums2[j];
            j++;
            index++;
            
        }
        int len = arr.length;
        if(len%2 == 0){
            return (arr[len/2] + arr[len/2-1])/2.0;
        }
        else{
            return arr[len/2];
        }
      
    }
}