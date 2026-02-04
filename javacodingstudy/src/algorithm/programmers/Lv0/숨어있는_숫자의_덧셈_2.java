package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String my_string = br.readLine();
		int answer = 0;
		String[] arr = my_string.split("[A-z]");
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				answer+=Integer.parseInt(arr[i]);
			}
		}
		System.out.println(answer);
	}

}
