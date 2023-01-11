class Solution {
    public boolean detectCapitalUse(String word) {
        int val_f = word.charAt(0);
        int val_l = word.charAt(word.length()-1);
        if((val_f>=65 && val_f<=90) && (val_l>=65 && val_l<=90)){
            for(int i=1; i<word.length()-1; i++){
                int val_r = word.charAt(i);
                if(val_r>=65 && val_r<=90){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else if((val_f>=65 && val_f<=90) && (val_l>=97 && val_l<=122)){
            for(int i=1; i<word.length()-1; i++){
                int val_r = word.charAt(i);
                if(val_r>=97 && val_r<=122){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        else if((val_f>=97 && val_f<=122) && (val_l>=97 && val_l<=122)){
            for(int i=1; i<word.length()-1; i++){
                int val_r = word.charAt(i);
                if(val_r>=97 && val_r<=122){
                    continue;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}