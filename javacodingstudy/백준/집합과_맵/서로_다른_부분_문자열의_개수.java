package 집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 서로_다른_부분_문자열의_개수 {
	
	public static void main(String[] args) throws IOException {
		// a, b, c,ba, ab, bc, aba, bab, abc, abab, babc, ababc
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i <= S.length(); i++) {
			for (int j = i+1; j <= S.length(); j++) {
					set.add(S.substring(i, j));

				
				
			}
		}
		System.out.println(set.size());
	}

}
