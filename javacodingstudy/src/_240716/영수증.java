package _240716;

import java.util.Scanner;

public class 영수증 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		//
		int total = 0;
		for(int i = 0; i<n; i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			total += a*b;
			
		}
		if(x == total) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
