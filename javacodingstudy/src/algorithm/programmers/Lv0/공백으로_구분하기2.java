package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 공백으로_구분하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string = "    programmers  ";
	

//		String[] answer = my_string.split("\\s+");
		String[] answer = my_string.trim().split("\\s+");
		

		System.out.println(Arrays.toString(answer));
	}

}
