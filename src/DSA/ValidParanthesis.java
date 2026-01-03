package DSA;

import java.util.*;

public class ValidParanthesis {

    static boolean checkValidParanthesis(String text) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char x: text.toCharArray()){
            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
            }
            else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(x == '}' && top != '{') return false;
                if(x == ']' && top != '[') return false;
                if(x == ')' && top != '(') return false;
            }
        }
        return  stack.isEmpty();
    }

    public static void main (String[] args){

        List<String> testCases = Arrays.asList(
                "()",
                "()[]{}",
                "(]",
                "([])",
                "([)]",
                "",
                "(){}}{"
        );

        for(String text: testCases){
            System.out.println(text);
            System.out.println(checkValidParanthesis(text));
        }

    }
}
