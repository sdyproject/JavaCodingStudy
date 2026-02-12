package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 정수_찾기 {

	public static void main(String[] args) throws IOException{
		int[] num_list =  {1,2,3,4,5};
//		int[] num_list =  {15, 98, 23, 2, 15};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			if(n == num_list[i]) {
				answer = 1;
			}
		}
		System.out.println(answer);
	}

}
