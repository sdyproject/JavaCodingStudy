package algorithm.backjoon.정렬;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 나이순_정렬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < N; i++) {
			int age = sc.nextInt();
			String name = sc.next();
			map.put(name, age);
		}
		
		
		System.out.println(map);
	}

}
