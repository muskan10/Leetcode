class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==')'){
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)=='}'){
                    if(!st.isEmpty() && st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)==']'){
                    if(!st.isEmpty() && st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
        }
        if(!st.isEmpty()){
           return false; 
        }
        return true;
    }
}