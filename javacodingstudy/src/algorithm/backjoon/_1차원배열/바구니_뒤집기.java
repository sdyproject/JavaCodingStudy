package algorithm.backjoon._1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class 바구니_뒤집기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;

		}
	
		for (int k = 0; k < M; k++) {
			int i =sc.nextInt() - 1;
			int j =sc.nextInt() - 1;
			
		
			for(int j2 = i; j2 <=j; j2++) {
				int m = j--;
				
				int temp =  arr[j2];
				arr[j2] = arr[m];
				arr[m] = temp;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		for(int a : arr) {
			System.out.print(a +" ");
		}
	}

}
 