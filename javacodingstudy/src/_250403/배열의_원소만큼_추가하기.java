package _250403;

import java.util.ArrayList;

public class 배열의_원소만큼_추가하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {6, 6};
		
//		 int[] answer = new int[];
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int num : arr) {
			for(int i =0; i<num; i++) {
				answer.add(num);	
			}
			
		}
		
		
		
		System.out.println(answer);
	}

}
