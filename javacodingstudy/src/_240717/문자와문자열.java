package _240717;

import java.util.Scanner;

public class 문자와문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		int B = sc.nextInt();
			
		sc.close();

		System.out.println(A.charAt(B-1));
			
		
	}

}
