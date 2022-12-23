class Solution {

    public boolean isPalindrome(String str){
        
        if(str.length()==1 || str.length()==0){
            return true;
        }
        else{
            if(str.charAt(0) == str.charAt(str.length()-1)){
                return isPalindrome(str.substring(1, str.length()-1));        //recursion
            }
            else {
                return false;
            }
        }
    }

    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}