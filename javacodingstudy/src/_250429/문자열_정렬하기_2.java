package _250429;

import java.util.Arrays;

public class 문자열_정렬하기_2 {

	public static void main(String[] args) {
		String my_String = "Bcad"; //abcd
//		String my_String = "heLLo"; //ehllo
//		String my_String = "Python"; //hnopty

		
	
		
		
		char[] ch = my_String.toLowerCase().toCharArray();
		
		Arrays.sort(ch);
		
		String answer=String.valueOf(ch);
		
		System.out.println(answer);
	}

}
