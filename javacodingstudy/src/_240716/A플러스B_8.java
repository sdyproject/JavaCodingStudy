package _240716;

import java.util.Scanner;

public class A플러스B_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int total = 0;
		for(int i = 1; i<=T; i++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			total += A+B;
			System.out.println("Case #"+i+":"+A+"+"+B+"="+total);
		}
		sc.close();
	}

}
