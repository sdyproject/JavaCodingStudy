package algorithm.programmers._250428;

import java.util.Arrays;

public class 특별한_이차원_배열_1 {

	public static void main(String[] args) {
//		int n =3;
		int n =6;
//		int n =1;
		
		int [][] answer = new int[n][n];
		
		for(int i =0; i<n; i++) {
		
				answer[i][i]++;
				
		}
		
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print(answer[i][j] + " ");
		    }
//		    System.out.println();  // 한 행 끝나면 줄바꿈
		}	}

}
