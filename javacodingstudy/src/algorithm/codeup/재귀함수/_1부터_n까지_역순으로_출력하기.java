package algorithm.codeup.재귀함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1부터_n까지_역순으로_출력하기 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		recursion(n);
	
	}
	public static void recursion(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		recursion(n-1);
	}
}
