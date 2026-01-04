package algorithm.programmers.Lv1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {

	public static void main(String[] args) {
		String[] answer;
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
//		String[] strings = {"abce", "abcd", "cdx"};
//		int n = 2;
		
		/// 자바버전8이전 사용 
		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
		        return Character.compare(s1.charAt(n), s2.charAt(2));
		    }
		});
		 System.out.println(Arrays.toString(strings));
		
		
		//람다식
//		  Arrays.sort(strings, Comparator.comparing(s -> s.charAt(n)));
//		
//		  System.out.println(Arrays.toString(strings));
		  
		  
		
	}

}
