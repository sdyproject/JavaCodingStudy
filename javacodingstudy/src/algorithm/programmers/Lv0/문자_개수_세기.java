package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 문자_개수_세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string ="Programmers";
		int[] answer = new int[52];
		
 		for(int i = 0; i<my_string.length(); i++) {
		 char a =	 my_string.charAt(i);
		 // my_string에서 값을 하나씩 가져와서 값이 대문자라면 
		 // ex) a(P)- 'A' 아스키코드를 이해하여 인덱스 파악 후 증가  'A'  : 65 'P' : 80
		 
		 if(Character.isUpperCase(a)) {
			 answer[a- 'A']++;
		 }else {
			 answer[a- 'a'+26]++;
		 }
		 
		}
 		
 		System.out.println(Arrays.toString(answer) );
	}

}
