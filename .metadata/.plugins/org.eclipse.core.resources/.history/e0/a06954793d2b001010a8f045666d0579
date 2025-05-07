package _250329;

import java.util.Arrays;

public class 수열과_구간_쿼리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries= {{0, 1},{1,2},{2,3}};
		int index =0;
//		 int[] answer = {};
		 
		 for(int i =0; i<queries.length; i++) {
			 if(queries[i][0]<=i && i<= queries[i][1]) {
				 arr[index]+=1;
				 arr[index+1]+=1;
				 index++;
			 }
			 			
		 }
		 System.out.println(Arrays.toString(arr));
	}

}
