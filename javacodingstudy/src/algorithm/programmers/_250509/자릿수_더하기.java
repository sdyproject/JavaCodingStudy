package algorithm.programmers._250509;

public class 자릿수_더하기 {

	public static void main(String[] args) {
		int n =123;
		int answer =0;
		
		for(int i =0; i<String.valueOf(n).length(); i++) {
			answer+=String.valueOf(n).charAt(i)-'0';
		}
		
		System.out.println(answer);
	}

}
