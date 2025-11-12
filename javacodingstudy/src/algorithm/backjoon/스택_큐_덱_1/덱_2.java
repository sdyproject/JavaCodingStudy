package algorithm.backjoon.스택_큐_덱_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 덱_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		Deque<Integer> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cmd = Integer.parseInt(st.nextToken());

			switch (cmd) {

			case 1:
			case 2:
				int val = Integer.parseInt(st.nextToken());
				if (cmd == 1) {
					q.addFirst(val);
				} else if (cmd == 2) {
					q.addLast(val);
				}
				break;
			case 3:
				if (q.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(q.pollFirst()).append('\n');
				}

				break;
			case 4:
				if (q.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(q.pollLast()).append('\n');
				}
				break;
			case 5:
				sb.append(q.size()).append('\n');
				break;
			case 6:
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}

				break;
			case 7:
				if (q.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(q.peekFirst()).append('\n');
				}

				break;
			case 8:
				if (q.isEmpty()) {
					sb.append(-1).append('\n');
				} else {
					sb.append(q.peekLast()).append('\n');
				}

				break;

			default:
				break;
			}
		}
		System.out.println(sb.toString());

	}

}
