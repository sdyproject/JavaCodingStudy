package _240814;

import java.util.Scanner;

public class 최댓값_2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int max =0;
		int c =0 ,b = 0;
		int[][] A  = new int[9][9];
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println(A[0][0]);
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {
				if(A[i][j]>max) {
					max = A[i][j];
					c =i+1;
					b =j+1;
				}
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(c+" "+b);
	}

}
