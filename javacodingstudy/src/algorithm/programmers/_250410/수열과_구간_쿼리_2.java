	package algorithm.programmers._250410;

import java.util.Arrays;

public class 수열과_구간_쿼리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		int[] answer = new int[queries.length];
		
		
		// 가장 작은 수를 찾는 조건에 맞지않게 작성
		// 결과는 동일하지만 프로그래머스문제 조건에 맞지 않아 실패
//		for(int j =0; j<queries.length; j++) {
//			for(int i =0; i<=queries[j][1]; i++) {
//				if(arr[i]>queries[j][2]) {
//					answer[j] = arr[i];
//				}else {
//					answer[j] = -1;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(answer));
		
		for(int j =0; j<queries.length; j++) {
			
			int s = queries[j][0];
			int e = queries[j][1];
			int k = queries[j][2];
			int min = Integer.MAX_VALUE;
				for(int i =s; i<=e; i++) {
				if(arr[i]>k && arr[i] <min) {
					min = arr[i];
				}
			}
				answer[j] = (min == Integer.MAX_VALUE) ? -1 : min;
		}
		System.out.println(Arrays.toString(answer));
		
	}

}

