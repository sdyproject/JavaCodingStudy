package algorithm.programmers._250326;

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string ="Stanley1yelnatS";
		System.out.println(my_string.length()); 
		char[] answer = my_string.toCharArray();
		char c;
		int s =4;
		int e= 10;
		
		
		for(int i=s; i<=e; i++) {
		     	c= answer[i];
		     	answer[i] = my_string.charAt(e);
		     	answer[e] =c;
		     	e--;
		     	
		}
		
		System.out.println(answer);
	}

}
