package _240716;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른A플러스B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		for(int i=0; i<T; i++) {

			
			//줄로 읽어와서 공백기분으로 문자열 나눔
			st = new StringTokenizer(bf.readLine());
			//두 숫자를 읽어와 더한 결과를 BufferedWriter씀 
			bw.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()))+"\n");
		}
	bw.close();
	}

}
