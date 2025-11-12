package algorithm.backjoon.정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 소트인사이드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int size = String.valueOf(N).length();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] += String.valueOf(N).charAt(i)-'0';
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		
		 String answer=sb.reverse().toString();
		System.out.println(answer);
	}

}
