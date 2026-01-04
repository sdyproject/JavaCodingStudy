package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모음_제거 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String my_string = br.readLine();
		// replaceAll 정규식 
		String answer = my_string.replaceAll("[aeiou]", "");
		
		System.out.println(answer);
	}

}
