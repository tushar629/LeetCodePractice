package com.company;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if(t=='('||t=='{'||t=='['){
                st.push(t);
            }

            if(t==')'||t=='}'||t==']'){

                if (st.isEmpty()) return false;


                char character1 = st.pop();
                char character2 = t;

                if (character1 == '(' && character2 == ')' || character1 == '{' && character2 == '}' || character1 == '[' && character2 == ']'){

                }
                else
                    return false;


            }


        }

        if (st.isEmpty())
            return true; /*balanced*/
        else
        {   /*not balanced*/
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isValid("((()(())))"));
    }

}
