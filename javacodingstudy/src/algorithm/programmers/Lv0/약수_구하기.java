package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 약수_구하기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int num = 1;
		ArrayList<Integer> list  = new ArrayList<>();
		while(num <= n) {
			if(n %  num == 0) {
				list.add(num);
			}
			num++;
		}
		Collections.sort(list);
		System.out.println(list);
	}

}
