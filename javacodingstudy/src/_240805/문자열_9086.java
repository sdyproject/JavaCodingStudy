package _240805;

import java.util.Scanner;

public class 문자열_9086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++ ) {
			String A = sc.next();
			System.out.println(A.charAt(0));
			System.out.println(A.charAt(A.length()-1));

		}
		
		

	}

}
