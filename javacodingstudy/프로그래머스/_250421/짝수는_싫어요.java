package _250421;

import java.util.ArrayList;

public class 짝수는_싫어요 {

	public static void main(String[] args) {
		int n = 15;
		int start =1;
		ArrayList<Integer> answer = new ArrayList<>();
		while(start<=n) {
			if(start%2!=0) {
				answer.add(start);
			}
			start++;
		}
		System.out.println(answer);
	}

}
