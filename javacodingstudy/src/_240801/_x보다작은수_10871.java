package _240801;

import java.util.Scanner;

public class _x보다작은수_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X =sc.nextInt();
		int A[] = new int[N];
		
		for(int i =0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j =0; j<A.length; j++)
		{
			if(A[j]<X) {
				System.out.println(A[j] + " ");
			}
		}
	}

}
