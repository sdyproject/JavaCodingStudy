package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 배열_회전시키기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String direction = br.readLine();

			int[] numbers = {4, 455, 6, 4, -1, 45, 6};
//		int[] numbers = { 1, 2, 3 };
		int[] answer = new int[numbers.length];

		if (direction.equals("right")) {
			answer[0] = numbers[numbers.length-1];
			for (int i = 1; i < numbers.length; i++) {
				answer[i] =  numbers[i-1];
			}
		}else {
			for (int i = 1; i < numbers.length; i++) {
				answer[i-1] =  numbers[i];
			}
			answer[answer.length-1] = numbers[0];

		}
		


		System.out.println(Arrays.toString(answer));
	}

}
