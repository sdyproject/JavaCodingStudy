package algorithm.programmers._250422;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_정렬하기_1 {

	public static void main(String[] args) {
//		String my_string = "hi12392";
//		ArrayList<Integer> answer = new ArrayList<>();
//
//		for(char ch : my_string.toCharArray()) {
//		 
//			if(Character.isDigit(ch)) {
//				answer.add(ch- '0');
//			}
//		}
//		
//		Collections.sort(answer);
//		//reverseOrder(): 내림차순 정렬
////		Collections.sort(answer,Collections.reverseOrder());
//		
//		System.out.println(answer);
		
		
		//다른 풀이 1
		String my_string = "hi12392";
		
		String str = my_string.replaceAll("[a-z]", "");
		
		int[] answer = new int[str.length()];
				System.out.println(str);
		
		for(int i = 0; i<str.length(); i++) {
			answer[i]=str.charAt(i)-'0';
			
		}
				
		
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));

		

		
	}
	}
