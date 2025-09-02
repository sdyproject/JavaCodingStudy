package 약수_배수와_소수_1;

import java.util.Scanner;

public class 배수와_약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a==0 && b ==0) {
				break;
			}
			
			if(b % a ==0) {
				System.out.println("factor");
			}else if(a % b==0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");

			}
			
		}
	}

}
