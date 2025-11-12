package algorithm.backjoon.심화_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashSet;
import java.util.Set;

public class 인사성_밝은_곰곰이 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < N; i++) {
			String cmd = br.readLine();
			
			if(cmd.equals("ENTER")) {
					count += set.size();
					set.clear();
					continue;				
			}
			set.add(cmd);
		}
		System.out.println(set.size()+count);
	}

}
