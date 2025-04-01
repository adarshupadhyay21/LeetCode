class Solution {
    public String removeDigit(String number, char digit) {
        String answer = "";
        
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String ans = number.substring(0, i) + number.substring(i + 1);
                if (ans.compareTo(answer) > 0) {
                    answer = ans;
                }
            }
        }
        return answer;
    }
}
