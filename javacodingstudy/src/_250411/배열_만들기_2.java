package _250411;

import java.util.ArrayList;

public class 배열_만들기_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l =5; int r = 555;

	ArrayList<Integer> answer = new ArrayList<>();
	for(int i = l; i<=r; i++) {
		String s= Integer.toString(i);
		boolean b= true;
		for(char c  : s.toCharArray()) {
			 if (c != '0' && c != '5') {
                 b = false;
                 break;
             }
		}
		
		if(b) {
			answer.add(i);
		}
	}
	
	
	System.out.println(answer);
	}

}
