package algorithm.programmers.Lv2;

import java.util.Stack;

public class 올바른_괄호 {

    public static void main(String[] args) {
        String s = "()()";
//        String s = "(())()";
//        String s = "(())()";
//        String s = ")()(";
//        String s = "(()(";
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {

                    break;
                }
                stack.pop();
            }

        }
        System.out.println(stack);
    }
}