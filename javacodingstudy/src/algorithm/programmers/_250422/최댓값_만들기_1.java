package algorithm.programmers._250422;

import java.util.Arrays;

public class 최댓값_만들기_1 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		Arrays.sort(numbers);
		
		int answer = numbers[numbers.length-2]*numbers[numbers.length-1];
		System.out.println(answer);
	}

}
