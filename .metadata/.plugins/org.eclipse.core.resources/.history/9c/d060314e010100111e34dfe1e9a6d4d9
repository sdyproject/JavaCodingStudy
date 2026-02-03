package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 최댓값_만들기_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] numbers = new int[st.countTokens()];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(st.nextToken(", "));
		}
		System.out.println(Arrays.toString(numbers));
//		int answer = 0;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = i+1; j < numbers.length; j++) {
//				
//				int sum =  numbers[i] * numbers[j];
//				if(answer > sum) {
//					answer = sum;
//				}
//			}
//		}
//		System.out.println(answer);
//		
		
		Arrays.sort(numbers);
		int answer =  Math.max(numbers[0] * numbers[1], numbers[numbers.length-2] * numbers[numbers.length-1]);
		System.out.println(answer);
	}

}
