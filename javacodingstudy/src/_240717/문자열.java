package _240717;

import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int i =0; i<A; i++){
			String B = sc.next();
		String front=String.valueOf(B.charAt(0));
		String last = String.valueOf(B.charAt(B.length()-1));
			System.out.println(front+last);
		}
	}

}
