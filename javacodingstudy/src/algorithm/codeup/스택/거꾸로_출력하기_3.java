package algorithm.codeup.스택;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 거꾸로_출력하기_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            stack.add(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            bw.write(stack.pop() + " ");
        }
        bw.flush();
        br.close();
    }
}