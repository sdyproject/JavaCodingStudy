package algorithm.programmers._250409;

public class 문자열_섞기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="aaaaa";
		String str2 ="bbbbb";
		
		String answer ="";
		
		for(int i =0; i<str1.length(); i++) {
			answer+= String.valueOf(str1.charAt(i))+ String.valueOf(str2.charAt(i));
		}
	       
		 System.out.println(answer);
	}

}
