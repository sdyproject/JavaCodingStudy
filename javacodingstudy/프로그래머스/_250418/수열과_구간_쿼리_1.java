package _250418;

import java.util.Arrays;

public class 수열과_구간_쿼리_1 {

	public static void main(String[] args) {
		// 해결못함
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries= {{0,1},{1,2},{2,3}};
		int[] answer = new int[arr.length];
		
		for(int i = 0; i<queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			
			if(arr[s]<=i && arr[e]>=i) {
				
			}
			
		}
		
		
		
		
	}

}
