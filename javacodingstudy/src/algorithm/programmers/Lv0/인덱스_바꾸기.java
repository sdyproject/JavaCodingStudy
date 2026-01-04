package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 인덱스_바꾸기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String my_string = st.nextToken();
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		
		char[] c =  my_string.toCharArray();
		
		
			char ch = c[num1];
			c[num1] = c[num2];
			c[num2] = ch;
			
		String answer = String.valueOf(c);
		System.out.println(answer);
		
	}

}
