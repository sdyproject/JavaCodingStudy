package _240801;

import java.util.Arrays;
import java.util.Scanner;

public class 최소최대_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] =new int[N];
		
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
		
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[N - 1]);
		
		
	}

}
