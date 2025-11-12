package algorithm.programmers._250327;

public class qr_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번 입출력
//		int q = 3;
//		int r = 1;
//		String code ="qjnwezgrpirldywt";
		//2번 입출력
		int q = 1;
		int r = 0;
		String code ="programmers";
		 String answer = "";
		char[] arr  = code.toCharArray();
		for(int i =0; i<arr.length; i++) {
				if(i%q==r) {
					answer+=String.valueOf(arr[i]);
				}
		}
		System.out.println(answer);
	}

}
