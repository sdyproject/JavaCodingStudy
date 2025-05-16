package _250516;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

	public static void main(String[] args) {
		String s ="Zdcdefg";
		String answer ="";
		Character[] ch = new Character[s.length()];
		for(int i=0; i<s.length(); i++) {
			ch[i]=s.charAt(i);
		}
		Arrays.sort(ch,Collections.reverseOrder());
	
		
		for (char c : ch) {
			answer+=c;
        }
		System.out.println(answer);
//		System.out.println(sb.toString());
	}

}
