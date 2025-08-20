package _240802;

import java.util.Scanner;

public class 과제_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N[] = new int[30];
		
		for(int i =0; i<28; i++) {
			int A = sc.nextInt();
			N[A-1] =1;
		}
		
		for(int i = 0; i<30; i++) {
			
			if(N[i] == 0)
				System.out.println(i+1);
		}

	}

}
