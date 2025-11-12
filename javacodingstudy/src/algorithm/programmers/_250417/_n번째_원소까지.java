package algorithm.programmers._250417;

import java.util.Arrays;

public class _n번째_원소까지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3	;
		int[] answer = new int[n];
		for(int  i =0; i<n; i++) {
			answer[i] = num_list[i];
		}
		System.out.println(Arrays.toString(answer));
	}

}
