package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 가장_큰_수_찾기 {

	public static void main(String[] args) {
		
		int[] array = {1, 8, 3};
//		int[] array = {9, 10, 11, 8};
		
		int[] answer =  new int[2];
		
		int max = array[0];
		int index = 0;
		for (int i = 1; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				index = i;
			}
		}
		
		answer[0] = max;
		answer[1] =  index;
		System.out.println(Arrays.toString(answer));
	}

}
