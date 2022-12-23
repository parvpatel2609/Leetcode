class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int str_length = str.length;
        String ans = str[str_length-1];

        return ans.length();
    }
}