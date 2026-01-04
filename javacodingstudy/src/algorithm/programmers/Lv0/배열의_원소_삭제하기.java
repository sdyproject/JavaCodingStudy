package algorithm.programmers.Lv0;

import java.util.ArrayList;

public class 배열의_원소_삭제하기 {

	public static void main(String[] args) {
		int[] arr={293, 1000, 395, 678, 94};
			int[] delete_list= {94, 777, 104, 1000, 1, 12};
			
		ArrayList<Integer> answer = new ArrayList<>();
		
		
			
			for(int num : arr) {
				answer.add(num);
			}
			for(int num : delete_list) {
				answer.remove(Integer.valueOf(num));
			}
			
			System.out.println(answer);
		
		
	}

}
