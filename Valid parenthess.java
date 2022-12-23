import java.lang.String;

class Solution {
    public boolean isValid(String str) {
        char last_in = '0';
        boolean flag = false;
        Stack<Character> st = new Stack();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            if(str.charAt(i) == '['){
                st.push(str.charAt(i));
            }
            if(str.charAt(i) == '{'){
                st.push(str.charAt(i));
            }

            if(str.charAt(i) == ')'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    last_in = st.peek();
                    if(last_in == '('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            if(str.charAt(i) == ']'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    last_in = st.peek();
                    if(last_in == '['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            if(str.charAt(i) == '}'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    last_in = st.peek();
                    if(last_in == '{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}