
//BRUTE FORCE
// class Solution {
//     public int majorityElement(int[] nums) {
//         int count =0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){

//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//         if(count>nums.length/2){
//             return nums[i];
//         }
//         }
//         return -1;
//     }
// }



//Better
// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         for(Integer key : map.keySet()){
//             if(map.get(key)>nums.length/2){
//                 return key;
//             }
//         }
//         return -1;
//     }
// }


//OPTIMAL
class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int ele = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
            }

            if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
}