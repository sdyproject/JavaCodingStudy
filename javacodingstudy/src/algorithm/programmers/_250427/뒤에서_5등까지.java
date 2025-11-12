package algorithm.programmers._250427;

import java.util.Arrays;

public class 뒤에서_5등까지 {

	public static void main(String[] args) {
			
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		int[] answer = new int[5];
		Arrays.sort(num_list);
		for(int i=0; i<5; i++) {
			answer[i] =num_list[i];
		}
		System.out.println(Arrays.toString(answer));
	}

}
