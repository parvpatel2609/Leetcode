class Solution {
    public int percentageLetter(String s, char letter) {
        int per = 0, count=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        
        // System.out.println (letter + " : " + count);

        per = (count*100) / s.length();

        // System.out.println("per : " + per);

        return per; 
    }
}