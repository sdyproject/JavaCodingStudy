package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대문자와_소문자 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String my_string = br.readLine();
		
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if(Character.isUpperCase(my_string.charAt(i))) {
				answer+=Character.toLowerCase(my_string.charAt(i));
			}else {
				answer+=Character.toUpperCase(my_string.charAt(i));
			}
		}
		System.out.println(answer);
	}

}
