package algorithm.backjoon.집합과_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 대칭_차집합 {

	public static void main(String[] args)  throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
	
		st = new StringTokenizer(br.readLine());
		Set<Integer> set= new HashSet<>();
		for (int i = 0; i < A; i++) {
			set.add(Integer.parseInt(st.nextToken()));
				
		}
		int count =0;
		int n_count = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < B; i++) {
			if(!set.contains(Integer.parseInt(st.nextToken()))) {
				count++;
			}else {
				n_count++;
			}
				
		}
		System.out.println(count+(A-n_count));
	}
	

}
