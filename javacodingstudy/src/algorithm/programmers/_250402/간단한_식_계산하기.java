package algorithm.programmers._250402;

import java.util.Arrays;

public class 간단한_식_계산하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  binomial = "40000 * 40000";
		String[] arr=binomial.split(" ");
		int answer =0;
		 int num1 = Integer.parseInt(arr[0]);
	        int num2 = Integer.parseInt(arr[2]);
		
		if(arr[1].equals("+")) {
			answer = num1 + num2;
        } else if(arr[1].equals("-")) {
        	answer = num1 - num2;
        } else if(arr[1].equals("*")) {
        	answer = num1 * num2;
        } 
		System.out.println(answer);
	}

}
