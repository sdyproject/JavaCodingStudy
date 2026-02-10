package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열로_변환 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  n = Integer.parseInt(br.readLine());
		String answer = String.valueOf(n);
		System.out.println(answer);
	}

}
