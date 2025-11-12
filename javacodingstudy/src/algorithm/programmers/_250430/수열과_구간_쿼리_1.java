package algorithm.programmers._250430;

import java.util.Arrays;

public class 수열과_구간_쿼리_1 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4}; 
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
//        int[] answer = new int [arr.length];
//		for(int i =0; i<queries.length; i++) {
//			int s = queries[i][0];
//			int e = queries[i][1];
//			if(s<=i && i<=e) {
//				for(int j =s; j<=e; j++) {
//					arr[j]++;
//				}
//			}
//		}
//		for(int i=0; i<arr.length; i++) {
//			answer[i] = arr[i];
//		}
//		System.out.println(Arrays.toString(answer));
		 int[] answer = new int [arr.length];
			for(int i =0; i<queries.length; i++) {
				int s = queries[i][0];
				int e = queries[i][1];
				
					for(int j =s; j<=e; j++) {
					
						arr[j]++;
					}
				
			}
			for(int i =0; i<arr.length; i++) {
				answer[i] = arr[i];

			}
			System.out.println(Arrays.toString(arr));
	}

}
