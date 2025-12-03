package algorithm.programmers.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 자릿수_더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n =  Integer.parseInt(br.readLine());
		String num = String.valueOf(n);
		int answer = 0;
		for (int i = 0; i < num.length(); i++) {
			answer+= num.charAt(i)-'0';
		}
		System.out.println(answer);
	}

}
