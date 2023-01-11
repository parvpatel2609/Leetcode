class Solution {
    public String replaceDigits(String s) {
        String str = "";

        for(int i=0; i<s.length(); i++){
            int val = s.charAt(i);

            // System.out.println("First : "+val);

            if(val>=97 && val<=122){
                str += s.charAt(i);
            }
            else if(Character.isDigit(s.charAt(i))){
                char v = s.charAt(i-1);
                int num = Character.getNumericValue(s.charAt(i)); 

                // val += v + Character.getNumericValue(s.charAt(i));
                val = v+num;

                System.out.println("Before char : "+v);
                System.out.println("number : "+num);
            
                System.out.println(val);
                str += (char)val;
            }
        }
        
        return str;
    }
}