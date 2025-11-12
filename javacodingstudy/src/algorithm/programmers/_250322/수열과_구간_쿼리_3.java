package algorithm.programmers._250322;

import java.util.Arrays;
import java.util.Iterator;

public class 수열과_구간_쿼리_3 {

	public static void main(String[] args) {
		// 프로그래머스 문제 
		
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0,3},{1,2},{1,4}};
		
		int query =0;		
		
		
		for(int i=0; i<queries.length; i++) {
			query = arr[queries[i][0]];
			arr[queries[i][0]] = queries[i][1];
			 arr[queries[i][1]] = query;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
