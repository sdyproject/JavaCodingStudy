package _250402;

import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString ="axbxcxdx";
		String[] answer = myString.split("x");
		Arrays.sort(answer);
		 System.out.println(Arrays.toString(answer));
	}

}
