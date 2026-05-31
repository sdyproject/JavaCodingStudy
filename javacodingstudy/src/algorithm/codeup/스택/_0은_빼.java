package algorithm.codeup.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _0은_빼 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }
        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        System.out.print(answer);
        br.close();
    }
}