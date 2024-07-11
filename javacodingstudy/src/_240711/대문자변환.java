package _240711;

import java.util.Scanner;

public class 대문자변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		char b;
		String answer = "";
		
		for(int i = 0; i<a.length(); i++) {
			b=a.charAt(i);
			
			if (!Character.isUpperCase(b)) {
				answer += Character.toUpperCase(b);
				
			}else {
				answer += b;
			}
		}
		System.out.println(answer);
	}

}
