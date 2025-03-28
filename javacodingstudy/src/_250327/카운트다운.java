package _250327;

import java.util.Arrays;

public class 카운트다운 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_num =10; 
		int end_num =3;
		int[] answer = new int[start_num-end_num+1];
		int start =0;
		for(int i = start_num; i>= end_num; i--) {
			answer[start] = i;
			start++;
		}
		System.out.println(Arrays.toString(answer));
	}

}
