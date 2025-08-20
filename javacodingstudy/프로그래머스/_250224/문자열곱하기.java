package _250224;

import java.util.Scanner;

public class 문자열곱하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int k =sc.nextInt();
		/* 기존 내 코드
		 * String result = " "; for(int i=0; i<k; i++) { result+= my_string;
		 * 
		 * }
		 */
		
		System.out.println(my_string.repeat(k));
	}	

}
