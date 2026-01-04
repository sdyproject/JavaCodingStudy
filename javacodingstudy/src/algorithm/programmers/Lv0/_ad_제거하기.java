package algorithm.programmers.Lv0;

import java.util.ArrayList;

public class _ad_제거하기 {

	public static void main(String[] args) {
//		String[] strArr = {"and","notad","abcd"};
		String[] strArr = {"there","are","no","a","ds"};
		
		ArrayList<String> answer = new ArrayList<>();
		
		
		for(String str : strArr) {
			if(!str.contains("ad")) {
				answer.add(str);
			}
		}
		System.out.println(answer);
	}

}
