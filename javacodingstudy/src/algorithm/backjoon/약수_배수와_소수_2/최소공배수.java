package algorithm.backjoon.약수_배수와_소수_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.PublicKey;
import java.util.StringTokenizer;

public class 최소공배수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int div= 2;
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A%div==0 && B%div ==0) {
				A = A/div;
				B = A/div;
			}else {
				++div;
				if (A%div==0 && B%div ==0) {
					A = A/div;
					B = A/div;
				}
			}
		}

	}

}
