package algorithm.programmers._250423;

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3"; 
		int s = 6; int e = 12;
		
		 
		 StringBuilder answer = new StringBuilder(my_string);
		
		for(int i =0; i<my_string.length(); i++) {
			
			StringBuilder sb = new StringBuilder(my_string.substring(s,e+1));
			System.out.println(sb);
			sb.reverse();
			
			answer.replace(s, e+1,  sb.toString());
			
			
		}
		
		System.out.println(answer);
		 

	}

}
