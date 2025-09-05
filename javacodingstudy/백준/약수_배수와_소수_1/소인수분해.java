package 약수_배수와_소수_1;

import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		
		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				N = N / i;
				System.out.println(i);
			}

		}
		// 합성수(ex 6,8)라면 for문을 통해 소인수분해되지만 N이 애초에 소수라면 N를 출력
		if (N > 1) {
			System.out.print(N);
		}

	}

}
