package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된_문자_제거 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  my_string = br.readLine();
//		String answer = "";
//		for (int i = 0; i < my_string.length(); i++) {
//			if(!answer.contains(String.valueOf(my_string.charAt(i)))) {
//				answer+=my_string.charAt(i);
//			}
//		}
//		System.out.println(answer);
		
		
		// 다른분 풀이 
			String[] answer = my_string.split("");
	        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
	        System.out.println(String.join("", answer));
	}

}
