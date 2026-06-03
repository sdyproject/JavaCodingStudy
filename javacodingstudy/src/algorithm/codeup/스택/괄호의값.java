package algorithm.codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호의값 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // (()[[]])([])
        Stack<Character> stack = new Stack<>();

        int answer = 0;
        int num = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '(':
                    num *= 2;
                    stack.push(ch);
                    break;
                case '[':
                    num *= 3;
                    stack.push(ch);
                    break;
                case ')':
                    if (str.charAt(i - 1) == '(') {
                        answer += num;
                    }
                    stack.pop();
                    num /= 2;
                    break;
                case ']':
                    if (str.charAt(i - 1) == '[') {
                        answer += num;
                    }
                    stack.pop();
                    num /= 3;
                    break;
            }

        }

        if (!stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(answer);
        }

    }
}