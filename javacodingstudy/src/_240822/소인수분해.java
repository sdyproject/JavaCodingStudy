package _240822;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt(); 
		System.out.println("Math.sqrt(N): "+Math.sqrt(N));
		
		sc.close();
		for(int i = 2; i<=Math.sqrt(N); i++) {
			while(N % i == 0) {
				System.out.println("i : "+i);
				N/=i;
			}
		}
		
		if (N != 1) {
			System.out.println("N : "+N);
		}
	}

}
