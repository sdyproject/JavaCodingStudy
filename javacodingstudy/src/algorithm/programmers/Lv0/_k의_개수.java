package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _k의_개수 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = Integer.parseInt(st.nextToken());
		int j = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int answer = 0;
		//1이 포함된 수를 카운트하는걸로 문제 해석 
//		for (int k2 = i; k2 <= j; k2++) {
//			if(String.valueOf(k2).contains(String.valueOf(k))) {
//				System.out.println(k2);
//
//				answer++;
//			}
//		}
//		System.out.println(answer);
		
		for (int l = i; l <= j; l++) {
			String[] arr=String.valueOf(l).split("");
				for (int m = 0; m < arr.length; m++) {
					if( arr[m].equals(String.valueOf(k))) {
						answer++;
					}
				}
		}
		System.out.println(answer);
	}

}
