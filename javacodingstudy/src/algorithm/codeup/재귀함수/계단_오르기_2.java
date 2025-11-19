package algorithm.codeup.재귀함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기_2 {
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[100001];
		System.out.println(stairs(n));
		
		

	}
	public static  int stairs(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(n == 3) return 4;
		
		if(arr[n] !=0) {
			return arr[n];
		}
		arr[n] = stairs(n-1) + stairs(n-2) + stairs(n-3);
		return arr[n];

	
	}
}
