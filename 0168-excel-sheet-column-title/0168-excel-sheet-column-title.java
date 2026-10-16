class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(0<columnNumber){
            columnNumber--;
            char ch=(char)('A'+columnNumber%26);
            s.append(ch);
            columnNumber=columnNumber/26;
        }
        return s.reverse().toString();
    }
}