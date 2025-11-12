package algorithm.programmers._250326;

public class 문자열의_뒤의_n글자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string ="He110W0r1d";
		int n =5;
        int num = my_string.length()-n;
        String answer = "";

        for(int i =num; i<my_string.length(); i++) {
        	answer += my_string.charAt(i);
        }
		System.out.println(answer);
	}

}