package algorithm.programmers._250412;

import java.util.ArrayList;

public class 콜라츠_수열_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		ArrayList<Integer> answer = new ArrayList<>();

		answer.add(n);
		
		while(n !=1) {
			if(n%2==0 ) {
				n = n/2;
				answer.add(n);
			}else {
				n = 3*n+1;
				answer.add(n);
			}
		}
		System.out.println(answer);
	}

}
