package algorithm.programmers._251027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 콜라_문제 {

	static int count;
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int n = Integer.parseInt(st.nextToken());
	
	
	int answer = cola(a, b, n, 0);
	System.out.println(answer);

	}
	
	public static int cola(int a,int b ,int n, int count) {
		if(n < a) {
			return count;
		}
		
		int num = (n / a) * b;
		n = (n % 2) + num;
		return cola(a, b, n, count+num);
		
		
		
	}

}
