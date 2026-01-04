package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 마지막_두_원소 {

	public static void main(String[] args) {
		//정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 
		//그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
		
		
		// answer배열 크기가 num_list 길이+1 하나가 추가되게 하여 사용한 방법 
		int[] num_list = {2, 1, 6}; //result : 2,1,6,5

		int[] answer = new int[num_list.length+1];
		int end = num_list[num_list.length-1];
		int second_end = num_list[num_list.length-2];
		
		
		 for(int i=0; i<num_list.length; i++){
			 answer[i] = num_list[i];
			 
			 
	        }
		
		 answer[answer.length-1] = ((end>second_end) ? end-second_end : end*2); 
		System.out.println(Arrays.toString(answer));
		 
		 
//		 ArrayList 사용한 방법 
		  
//		 		int[] num_list = {2, 1, 6};
//		  		List<Integer> answer = new ArrayList();
//		  	
//		   		int end = num_list[num_list.length-1];
//					int second_end = num_list[num_list.length-2];
//					
//					 for(int i=0; i<num_list.length; i++){
//			 		
//          		      answer.add(num_list[i]);
//			 
//			 
//	        }
//	        	answer.add((end>second_end) ? end-second_end : end*2); 
//	        	System.out.println(answer);
//		
//		  
		  
		  
			
		
	}

}
