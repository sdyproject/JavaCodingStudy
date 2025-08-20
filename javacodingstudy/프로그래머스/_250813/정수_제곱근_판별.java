package _250813;

public class 정수_제곱근_판별 {

	public static void main(String[] args) {
		long n = 121;
//		long n =3;
		long answer = 0;
		
		double num = Math.sqrt(n);
		int j = (int) Math.floor(num);
		
		if(Math.pow(j, 2)==n) {
				answer= (long) Math.pow(num+1, 2);
		}else {
			answer = -1;
		}
	
		System.out.println(answer);

	}

}
