package _240711;

import java.util.Scanner;


public class 팩토리얼 {

	public static int calFact(int i) {
		
		if(i == 1 ) {
			return 1;
		}
		
		 return i * calFact(i -1 );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		
		
		int ans = 0;
		
		ans = calFact(a);
		
		System.out.println(ans);
	}

}
