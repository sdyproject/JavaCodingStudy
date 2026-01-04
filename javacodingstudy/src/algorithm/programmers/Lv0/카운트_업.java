package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 카운트_업 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start_num=3; 
		int end_num=10;
		 int[] answer = new int[(end_num-start_num)+1];
		 int index =0;
		 for(int i =start_num; i<=end_num; i++) {
			 answer[index] = i;
			 index++;
		 }
		 System.out.println(Arrays.toString(answer));
		 
		 
		 //		while(start_num==end_num) {
//			start_num++;
//			amswer[] +=start_num;
//		}
	}

}
