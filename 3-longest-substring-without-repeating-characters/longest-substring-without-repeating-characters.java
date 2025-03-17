class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
             return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int maxlen = 0;

        for(int r=0;r<s.length();r++){
            if(set.contains(s.charAt(r))){
                while(l<r && set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
                }
            }
            set.add(s.charAt(r));
            maxlen = Math.max(maxlen,r-l+1);

        }
            
        return maxlen;
    }
}