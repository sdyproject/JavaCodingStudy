package algorithm.programmers._250508;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {

	public static void main(String[] args) {
//		int[] array = {5, 9, 7, 10};
//		int dis =5;
		int[] arr = {2, 36, 1, 3};
		int divisor =1;
//		int[] array = {3,2,6};
//		int dis =10;
		

		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int num : arr) {
			if(num%divisor==0) {
				answer.add(num);
			}
		}
		
		if(answer.size()==0) {
			answer.add(-1);
		}else {
			Collections.sort(answer);
		}
		
		System.out.println(answer);
	}

}
