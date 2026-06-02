package algorithm.codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른_괄호_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);


            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("bed");
                    return;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }
}