package algorithm.programmers.Lv0;

public class n보다_커질_때까지_더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numbers = {34, 5, 71, 29, 100, 34};
//		int n = 123;
		int[] numbers = {58, 44, 27, 10, 100};
		int n = 139;
		 int answer = 0;
		for(int i =0; i<numbers.length; i++) {
			answer+=numbers[i];
			
			if(answer>n) {
				break;
			}
		}
		System.out.println(answer);
	}

}
