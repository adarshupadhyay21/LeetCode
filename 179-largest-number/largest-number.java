class Solution {
    public String largestNumber(int[] nums) {
        int num = nums.length;
        String [] s= new String[num];
        for(int i =0;i<num;i++)
        {
            s[i] = String.valueOf(nums[i]);
        }  
            Arrays.sort (s,(a,b) ->(b+a).compareTo(a+b));
            if (s[0].equals("0")) {
            return "0";
              }
            StringBuilder sb = new StringBuilder();
            for(String str : s)
            sb.append(str);
            return sb.toString() ;
    }
}