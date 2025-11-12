package algorithm.programmers._250509;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

	public static void main(String[] args) {
		long l =12345;
		
		int[] answer = new int[String.valueOf(l).length()];
		int index=0;
		for(int i =answer.length-1; i>=0; i-- ) {
			answer[index++] += String.valueOf(l).charAt(i)-'0';
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
