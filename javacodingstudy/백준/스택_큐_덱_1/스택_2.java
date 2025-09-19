package 스택_큐_덱_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int cmd = Integer.parseInt(st.nextToken());

			switch (cmd) {
			case 1:
				int val = Integer.parseInt(st.nextToken());
				stack.push(val);
				break;
			case 2:
				if (!stack.isEmpty()) {
					bw.write(stack.pop() + "\n");

				} else {
					bw.write(-1 + "\n");

				}
				break;
			case 3:
				bw.write(stack.size() + "\n");

				break;
			case 4:
				if (!stack.isEmpty()) {
					bw.write(0 + "\n");

				} else {
					bw.write(1 + "\n");

				}
				break;
			case 5:
				if (!stack.isEmpty()) {
					bw.write(stack.peek() + "\n");

				} else {
					bw.write(-1 + "\n");

				}
				break;
			default:
				break;
			}

		}
		bw.close();
	}

}
