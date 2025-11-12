package algorithm.programmers._250401;

public class 특정한_문자를_대문자로_바꾸기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String my_string ="programmers";
	
//		String alp="p";
		String my_string ="lowercase";
		String alp="x";
		 String answer = "";
		
		for(int i =0; i<my_string.length(); i++) {
			if(my_string.charAt(i)==alp.charAt(0)) {
				answer+=Character.toUpperCase(my_string.charAt(i));
			}else {
				answer+=my_string.charAt(i);
			}
		}
		System.out.println(answer);
	}

}
