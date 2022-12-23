class Solution {
    public String reverseVowels(String s) {
        List<Character> ch = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                ch.add(s.charAt(i));
            }
        }


        String str = "";
        int len = ch.size()-1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                str += ch.get(len);
                len--;
            }
            else{
                str += s.charAt(i);
            }
        }

        return str;
    }
}