package algorithm.programmers._250401;

public class 원하는_문자열_찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString ="AbCdEfG";
		String pat ="aBc";
		int  answer =0;
//		String myString ="aaAA";
//		String pat ="aaaaa";
		
		
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			answer++;
		}
		System.out.println(answer);
	}

}
