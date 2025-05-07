package _240830;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 단어정렬_1181 {

	public static void main(String[] args) {
		// 단어 길이론 정렬했으나 중복 삭제+ 알파벳순 정렬 완료 x
		// 공부 후에 수정!!!
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] A  = new String[N]; 
		for(int i = 0; i<N; i++) {
			 A[i]= sc.next();
			
		}
		Arrays.sort(A, Comparator.comparingInt(String::length));

		/* Arrays.sort(A); */
		for(int i = 0; i<N; i++) {
			System.out.println(A[i]);
		}
	

	}

}
