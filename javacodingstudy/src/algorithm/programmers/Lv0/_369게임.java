package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _369게임 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int order =  Integer.parseInt(br.readLine());
		char[] ch = String.valueOf(order).toCharArray();
		
		int answer = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == '3' || ch[i] == '6' || ch[i] == '9') {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
