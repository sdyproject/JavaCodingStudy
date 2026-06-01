package algorithm.codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 수식_계산_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String num : arr) {
            if (num.equals("*") || num.equals("+") || num.equals("-")) {
                int first = stack.pop();
                int second = stack.pop();

                switch (num) {
                    case "*":
                        stack.push(first * second);
                        break;
                    case "+":
                        stack.push(first + second);
                        break;
                    case "-":
                        stack.push(second - first);
                        break;

                }

            } else {
                stack.push(Integer.parseInt(num));
            }
        }

        System.out.println(stack.pop());
    }
}