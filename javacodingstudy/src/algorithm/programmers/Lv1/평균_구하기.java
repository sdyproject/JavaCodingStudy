package algorithm.programmers.Lv1;

public class 평균_구하기 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int sum =0;
		for(int num : arr) {
			sum+=num;
			
		}
		
		double answer = sum/ (double)arr.length;
		System.out.println(answer);
	}

}
