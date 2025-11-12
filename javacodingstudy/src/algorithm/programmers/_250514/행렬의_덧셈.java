package algorithm.programmers._250514;

import java.util.Arrays;

public class 행렬의_덧셈 {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 ={{3,4},{5,6}};
		
		 int[][] answer = new int[arr1.length][arr2[0].length];
		
		
		 for (int i = 0; i < arr1.length; i++) {
			    for (int j = 0; j < arr2[i].length; j++) {
			        answer[i][j] = arr1[i][j] + arr2[i][j];
			    }
			}
		 
		for (int i = 0; i < answer.length; i++) {
		    for (int j = 0; j < answer[i].length; j++) {
		        System.out.print(answer[i][j] + " ");
		    }
		    System.out.println(); 
		}
		
	}

}
