package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 암호_해독 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String cipher  = st.nextToken();
		int code  = Integer.parseInt(st.nextToken());
		
		String answer = "";
		for (int i = code-1; i < cipher.length(); i+=code) {
			 answer+= cipher.charAt(i);
		}
		System.out.println(answer);
	}

}
