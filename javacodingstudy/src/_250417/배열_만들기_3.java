package _250417;

import java.util.ArrayList;

public class 배열_만들기_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1,3},{0,4}};
		
		ArrayList<Integer> answer = new ArrayList<>();
		


		
		for(int j =0; j<intervals.length; j++) {
		
			for(int i =intervals[j][0]; i<=intervals[j][1]; i++) {
				
				answer.add(arr[i]);
			}
		}
		
		System.out.println(answer);
	}

}
