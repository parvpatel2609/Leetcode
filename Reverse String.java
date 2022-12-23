class Solution {

    public void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public void reverseString(char[] s) {
        int len = s.length-1;
        for(int i=0; i<s.length/2; i++){
            swap(s,i,len);
            len--;
        }
    }
}