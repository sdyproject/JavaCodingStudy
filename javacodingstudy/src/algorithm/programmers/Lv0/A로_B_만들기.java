package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;

public class A로_B_만들기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String before = st.nextToken();
		String after = st.nextToken();
		
		
		
		
		//contains로 하면 같으게 하나라도 있으면 1로 출력되기때문에 오류
		int answer = 1;
		for (int i = 0; i < before.length(); i++) {
//			if(before.contains(String.valueOf(after.charAt(i)))) {
//				
//			}else {
//				answer = 0;
//				break;
//			}
			
		}
		
		
		
		System.out.println(answer);

	}

}
