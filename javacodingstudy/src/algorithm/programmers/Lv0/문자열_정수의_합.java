package algorithm.programmers.Lv0;

public class 문자열_정수의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str ="1000000";
		int answer =0;
		for(int i = 0; i<num_str.length(); i++) {
			answer+=num_str.charAt(i)-'0';
		}
		System.out.println(answer);
	}

}
