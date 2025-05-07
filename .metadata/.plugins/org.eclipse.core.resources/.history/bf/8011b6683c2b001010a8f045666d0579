package _240802;

import java.util.Arrays;
import java.util.Scanner;

public class 평균_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*일반적인 평균 구하기 
		int N = sc.nextInt();
		int A[] = new int[N];
		int total = 0;
		
		for(int i =0; i<N; i++ ) {
			A[i] = sc.nextInt();
			total+= A[i];
		}
		System.out.println(total/N);*/
		
		int N = sc.nextInt();
		
		int A[] = new int[N];
		int total = 0;
		for(int i =0; i<N; i++ ) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		for(int i =0; i<N; i++) {
			
			total += A[i]; 
		}
		System.out.println("total : "+ total);
		System.out.println("A[N-1] : "+A[N-1]);
		System.out.println(total*100.0/A[N-1]/N);
		
	}

}
/*배열 사용하지 않는 방법

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); //입력 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1;
		double sum = 0.0;
		
		for (int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max) {
				max = value;
			}
			
			sum += value;
		}
	
		System.out.println(((sum / max) * 100.0) / N);
		
	}
}
참고: https://st-lab.tistory.com/47
*/
