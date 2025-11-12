package _250815;

import java.util.Arrays;

public class 이상한_문자_만들기 {

	public static void main(String[] args) {
//		String s = " disappeared aPpEaReD ";
//		String s = " try hello world ";
		String s = " read the explanation carefully  ";
				String answer = "";
					
			String[] arr = s.split(" ", -1);
		
			//1. 첫단어 앞 공백과 마지막 단어 공백은 제거하면 안된다.
			//2. 단어 간 공백 또한 제거 X
			//내풀이로는 단어 간 공백은 넣을 수 있지만 첫번째 조건을 충족하지 못함
			
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length(); j++) {
				
				String c= Character.toString(arr[i].charAt(j));
		
				if(j%2!=0) {
					answer+= c.toLowerCase();
				}else {
					answer+= c.toUpperCase() ;
				}
				
				
				if (j == arr[i].length() - 1) {
				    if (i != arr.length - 1) {
				        answer += " ";
				    }
				}
				
				
			}
		}
		System.out.println(answer);
		
		
	}

}
