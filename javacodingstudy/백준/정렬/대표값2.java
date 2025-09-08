package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 대표값2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n= sc.nextInt();
			arr[i] = n;
			sum+=n;
		}
		Arrays.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
	}

}
