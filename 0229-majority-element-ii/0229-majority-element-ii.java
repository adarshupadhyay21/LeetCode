//Brute 
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         List<Integer> ans = new ArrayList<>();

//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }

//         for(Integer key: map.keySet()){
//             if(map.get(key)>nums.length/3)
//                 ans.add(key);
//         }
//         return ans;
//     }
// }

//Optimal
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            if(cnt1 ==0 && ele2!=nums[i]){
                ele1 = nums[i];
                cnt1 =1;
            }
            else if(cnt2 == 0 && ele1!=nums[i]){
                ele2 = nums[i];
                cnt2 =1;
            }
            else if(nums[i] == ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        } 
        cnt1 = 0;
        cnt2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                cnt1++;
            }
            if(nums[i]== ele2){
                cnt2++;
            }
        }
        if(cnt1>nums.length/3){
            ans.add(ele1);
        }
        if(cnt2>nums.length/3 && ele1 != ele2){
            ans.add(ele2);
        }
        return ans;
    }
}