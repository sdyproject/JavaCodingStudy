package algorithm.programmers.Lv0;

import java.util.Arrays;

public class OX퀴즈 {

	public static void main(String[] args) {
//		String[] quiz = {"3 - 4 = -3" ,"5 + 6 = 11"};
		String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			 String[] arr=quiz[i].toString().split(" ");
			 
			 int first = Integer.parseInt(arr[0]);
			 int second = Integer.parseInt(arr[2]);
			 int result = Integer.parseInt(arr[4]);
			 int num = 0;
			 if(arr[1].equals("-")) {
				 num = first - second;
			 }else {
				 num = first + second;
			 }
			 
			answer[i] = (num == result)? "O" : "X"; 
			 
			 
		}
		System.out.println(Arrays.toString(answer));
		
	}

}
