package algorithm.programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 피자_나눠_먹기_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int slice = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int answer = (n % slice == 0) ? n/slice : n/slice+1;
		System.out.println(answer);
	}

}
