class Solution {
    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        for(int i=0; i<s1.length; i++){
            String str = s1[i];
            String rev = "";
            for(int j=s1[i].length()-1; j>=0; j--){
                rev += str.charAt(j);
            }
            // System.out.println(rev);
            s2[i] = rev;
        }

        String ans = "";

        for(int i=0; i<s2.length; i++){
            if(i!= s2.length - 1){
                ans += s2[i] + " ";
            }
            else{
                ans += s2[i];
            }
        }

        return ans;
    }
}