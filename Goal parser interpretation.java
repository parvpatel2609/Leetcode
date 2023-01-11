class Solution {
    public String interpret(String command) {
        String str = "";
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str = str + "o";
                i=i+1;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) != ')'){
                str = str + "al";
                i = i+3;
                // for(int j = i+1; j<command.charAt(i+1)=')'; j++){
                //     str = str + command.charAt(j);
                // }
            }
            else{
                str = str + command.charAt(i);
            }
        }
        System.out.println(str);
        return str;
    }
}