package _240814;

import java.util.Scanner;

public class 세로읽기_10798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[][] A = new String[5][15];
		
		for (int i = 0; i < 5; i++) {
			String B = sc.next();
			for (int j = 0; j < B.length(); j++) {
				A[i][j] = String.valueOf(B.charAt(j));
				
			}
		}
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
			 if(A[i][j] != null) {
				 System.out.println(A[i][j]);
			 }
			}
		}
		sc.close();
	}

}
