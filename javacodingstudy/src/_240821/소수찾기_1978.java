package _240821;

import java.util.Scanner;

public class 소수찾기_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		  int N = sc.nextInt(); int count = 0;
		  
		  for(int i=0; i<N; i++) { int A =sc.nextInt(); if(A/A ==1 && A!=1) { count++;
		  } } sc.close(); System.out.println(count);
		 
		
		
	}

}
