package algorithm.programmers._250421;

import java.util.Arrays;

public class 배열_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {1,2,3,4,5};
		int[] answer = new int[num_list.length];
		
		
		int index = 0;
		for(int i =num_list.length-1; i>=0; i--) {
			answer[index++] = num_list[i];
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
