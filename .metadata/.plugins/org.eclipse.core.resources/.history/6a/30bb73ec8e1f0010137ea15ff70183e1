package _250331;

import java.util.ArrayList;

public class 리스트_자르기 {
	public static void main(String[] args) {

		int n =4;
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		ArrayList<Integer> answer = new ArrayList<>();

		
		if(n ==1) {
			for(int i =0; i<num_list[slicer[1]] ; i++) {
				answer.add(num_list[i]);
			}
			
		}else if(n ==2) {
			for(int i =slicer[0]; i<num_list.length; i++) {
				answer.add(num_list[i]);
			}
			
		}else if(n ==3) {
			for(int i =slicer[0]; i<num_list[slicer[1]]; i++) {
				answer.add(num_list[i]);
			}
		}else {
			for(int i =slicer[0]; i<num_list[slicer[1]]; i+=slicer[2]) {
				answer.add(num_list[i]);
			}
			
		}
		
		 
	System.out.println(answer);
	}


		
		

}
