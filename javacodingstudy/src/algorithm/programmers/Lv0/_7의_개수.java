package algorithm.programmers.Lv0;

import java.util.Arrays;

public class _7의_개수 {

	public static void main(String[] args) {
		int[] arr = {7,77,17};
		int answer =0;
				String str =  Arrays.toString(arr);
				for (char c : str.toCharArray()) {
	                if (c == '7') {
	                    answer++;
	                }
				}
				
		System.out.println(answer);
	}

}
