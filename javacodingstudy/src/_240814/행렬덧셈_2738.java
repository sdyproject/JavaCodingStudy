package _240814;

import java.util.Scanner;

public class 행렬덧셈_2738 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		
		for(int i =0; i<N; i++) {
			for(int j =0; j<M; j++) {
				A[i][j] = sc.nextInt();
				
			}

		}
		
		for(int i =0; i<N; i++) {
			for(int j =0; j<M; j++) {
				A[i][j] += sc.nextInt();
				System.out.println(A[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
