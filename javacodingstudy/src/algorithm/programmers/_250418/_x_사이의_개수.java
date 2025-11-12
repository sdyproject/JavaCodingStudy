package algorithm.programmers._250418;

import java.util.Arrays;

public class _x_사이의_개수 {

	public static void main(String[] args) {
		
		String myString = "oxooxoxxox";
		
		//split 정리 다시 해야해야한다.
		String[] arr = myString.split("x", -1);
		System.out.println(arr.length);
		 int[] answer = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0 ; i<arr.length; i++) {
			answer[i] = arr[i].length();
		}
		System.out.println(Arrays.toString(answer));
	}

}
