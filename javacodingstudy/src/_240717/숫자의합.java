package _240717;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String A = sc.next();
		
		int total = 0;
		
		for(int i =0; i<N; i++) {
			total += A.charAt(i)-'0';
		}
		System.out.println(total);
		
	}

}
