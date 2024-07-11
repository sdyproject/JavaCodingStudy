package _240711;

import java.util.Scanner;

public class 아스키코드 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		String answer;
		
		// 입력 문자열 문자 배열로 변경
		char[] str = s.toCharArray();
		//버블 정렬 전체 문자열 길이에서 -1 만큼 패스 진행 시 문자열 완전 정렬
		for(int i =0; i<s.length() -1; i++) {
			for(int j =0; j<s.length()-1-i; j++) {
				
				if((int)str[j] < (int)str[j+1]) {
					
					char temp =str[j];
					str[j] = str[j+1];
                    str[j+1] = temp;
				}
			}
		}
		answer = new String(str);
		System.out.println(answer); 
	}
	

}
