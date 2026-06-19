/*
LeetCode 20 - Valid Parentheses

Question:
Given a string containing only the characters
'(', ')', '{', '}', '[' and ']',
determine whether the input string is valid.
*/

import java.util.Stack;

class ValidParentheses {
    public  static boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(ch=='{' || ch =='[' || ch =='('){
               st.push(ch);
           }else{
              if (st.isEmpty()) return false;
              if(  ch == '}' && st.peek()=='{'  || ch == ']' && st.peek()=='[' ||ch == ')' && st.peek()=='('){
                st.pop();
              }else{
                return false;
              }

           }
       }

        return st.empty();
        
         
        
    }
   
}