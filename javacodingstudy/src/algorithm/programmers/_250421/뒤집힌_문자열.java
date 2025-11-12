package algorithm.programmers._250421;

public class 뒤집힌_문자열 {

	public static void main(String[] args) {
		String my_string ="jaron";
		
		StringBuilder sb=  new StringBuilder(my_string);
        String answer =  sb.reverse().toString();
        System.out.println(answer);
	}

}
