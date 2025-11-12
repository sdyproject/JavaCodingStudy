package algorithm.backjoon.재귀;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class 칸토어_집합 {
	
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String in;
		while((in = br.readLine()) !=null) {
			int N = Integer.parseInt(in);
			int len =  (int) Math.pow(3, N);
			
			sb = new StringBuilder();
			for (int i = 0; i < len; i++) {
				sb.append("-");
			}
			space(0,len);
			System.out.println(sb);
		}
		
	}
	
	public static void space(int start, int len) {
		if(len == 1) {
			return;
		}
		int size = len/3;
		
		for (int i = start+size; i < start+2*size ; i++) {
			sb.setCharAt(i, ' ');
			
		}
		space(start,size);
		space(start+2*size, size);
		
	}

}
