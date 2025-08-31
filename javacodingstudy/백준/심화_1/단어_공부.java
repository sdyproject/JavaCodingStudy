package 심화_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 단어_공부 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		char answer = ' ';
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
//			char key = str.charAt(i);
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

		}

		System.out.println(map);

		int max = Collections.max(map.values());

		int count = 0;
		for (char ch : map.keySet()) {
			if (map.get(ch) == max) {
				answer = ch;
				count++;
				if (count > 1) {
					answer = '?';
					break;
				}
			}
		}
		System.out.println(answer);

	}

}
