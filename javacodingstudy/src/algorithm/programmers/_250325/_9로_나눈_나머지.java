package algorithm.programmers._250325;

public class _9로_나눈_나머지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number ="123";
		int answer = 0;
		int num = 0;
		for(int i =0; i<number.length(); i++) {
			//// '0'의 ASCII 값(48)을 빼면 숫자로 변환됨
			num+= number.charAt(i) -'0';
		}
		System.out.println(num);
		answer =num%9;
		System.out.println(answer);
	}
	
}
