class Solution {
    public boolean checkString(String s) {
        for(int i=0; i<s.length()-1; i++){
            int v = Character.getNumericValue(s.charAt(i));
            int v2 = Character.getNumericValue(s.charAt(i+1));

            if(v <= v2){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}