package _250427;

public class 부분_문자열인지_확인하기 {

	public static void main(String[] args) {
//		String my_string ="banana"; String target ="ana";
		String my_string ="banana"; String target ="wxyz";
		int answer =(my_string.contains(target)) ? 1: 0;
		
		System.out.println(answer);
	}

}
