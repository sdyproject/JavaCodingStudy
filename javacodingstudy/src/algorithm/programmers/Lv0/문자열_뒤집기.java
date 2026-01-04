package algorithm.programmers.Lv0;

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string="Progra21Sremm3";
		int s=6; int e=12;
		
		StringBuilder answer = new StringBuilder(my_string);

		
		
			StringBuilder sb = new StringBuilder(answer.substring(s,e+1));
			sb.reverse();
			answer.replace(s, e+1, sb.toString());
		
		System.out.println(answer);
	}

}
