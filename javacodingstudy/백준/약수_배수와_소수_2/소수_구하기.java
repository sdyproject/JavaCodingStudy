package 약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 소수_구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[N+1];
		
		for (int i = 2; i <=N; i++) {
			arr[i] =true;
		}

		for (int i = 2; i*i <= N; i++) {
			if(arr[i]) {
				for (int j = i*i; j <= N; j+=i) {
					arr[j] = false;
				}
			}
		}
		
		for (int i = M; i <=N; i++) {
			if(arr[i]) {
				bw.write(i+"\n");
			}
				
		}
		bw.flush();
		bw.close();
	}

}
