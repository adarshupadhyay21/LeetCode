class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        s = s.trim();  
        String words[] = s.split("\\s+");
        for(int i =words.length-1;i>=0;i--){
            str.append(words[i]);
            if(i!=0){
                str.append(" ");
            }
        }
        return str.toString();
    }
}