class Solution {
    public String longestPalindrome(String s) {
        String max = "";
        int maxlen = 0;
        if (s.length() == 1) { 
            return s;
        }

        for(int i=0;i<s.length();i++){
            for(int j=i+maxlen;j<s.length();j++){
                if(isPalindrome(s.substring(i,j+1))&& j-i+1>maxlen){
                   maxlen = j-i+1;
                   max = s.substring(i,j+1);
                }
            }
        }
            return max;
    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
           if(str.charAt(i)!=str.charAt(j)){
             return false;
           }
           i++;
           j--;
        }
        return true;
    }
}