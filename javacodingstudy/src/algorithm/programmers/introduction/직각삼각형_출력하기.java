package algorithm.programmers.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 직각삼각형_출력하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		
		String star = "";
		for (int i = 0; i < n; i++) {
			star += "*";
			System.out.print(star);
			System.out.println();
		}
	}
}
