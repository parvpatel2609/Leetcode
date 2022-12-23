class Solution {
    public boolean halvesAreAlike(String s) {
        int str1_vowels=0, str2_vowels=0;

        int len = s.length();

        String str1 = s.substring(0,s.length()/2).toLowerCase();
        String str2 = s.substring(s.length()/2,s.length()).toLowerCase();

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || 
			str1.charAt(i) == 'o' || str1.charAt(i) == 'u'){
                str1_vowels++;
            }
        }

        for(int i=0; i<str2.length(); i++){
            if(str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || 
			str2.charAt(i) == 'o' || str2.charAt(i) == 'u'){
                str2_vowels++;
            }
        }

        if(str1_vowels == str2_vowels){
            return true;
        }
        else{
            return false;
        }
    }
}