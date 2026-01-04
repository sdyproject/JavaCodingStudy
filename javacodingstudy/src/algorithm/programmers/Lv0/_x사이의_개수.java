package algorithm.programmers.Lv0;

import java.util.Arrays;

public class _x사이의_개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "oxooxoxxox";
		int[] answer = new int[6];
		int count = 0;
		
		for(int i =0; i<myString.length(); i++) {
			if(myString.charAt(i) !='x') {
				System.out.println(myString.charAt(i));
				count++;
			
			}
		}
		System.out.println(count);
		System.out.println(answer);

	}

}
