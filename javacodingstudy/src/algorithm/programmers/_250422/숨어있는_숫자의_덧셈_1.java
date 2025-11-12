package algorithm.programmers._250422;

public class 숨어있는_숫자의_덧셈_1 {

	public static void main(String[] args) {
		String my_string ="aAb1B2cC34oOp";
		int answer = 0;	
//		String str =  my_string.replaceAll("[A-Z]", "");
		String str =  my_string.toLowerCase().replaceAll("[a-z]", "");
		
//		int num = Integer.parseInt(str);
		
		
		for(int i = 0; i<str.length(); i++) {
			answer+=str.charAt(i)-'0';
		}
		
//		System.out.println(str);
		System.out.println(answer);
	}

}
