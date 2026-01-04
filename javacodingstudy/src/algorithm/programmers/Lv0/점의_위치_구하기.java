package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 점의_위치_구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		

		int[] dot = new int[2];
		
		for (int i = 0; i < 2; i++) {
		    dot[i] = Integer.parseInt(st.nextToken());
		}
		
		int first = (dot[0] > 0) ? 1 : 0;
		int second = (dot[1] > 0) ? 1 : 0;
		
		int answer = (first == 1 && second == 1) ? 1: 
					 (first == 0 && second == 1) ? 2:
					 (first == 0 && second == 0) ? 3:
					 4;
		System.out.println(answer);
		
		// 다른 풀이 
//		int first = dot[0];
//		int second = dot[1];
//		int answer = 0;
//		if(first > 0) {
//			answer = (second > 0) ? 1 : 4;
//		}else {
//			answer = (second > 0) ? 2 : 3;
//		}
//		System.out.println(answer);
							 	 
						
		
	}

}
