package _240801;

import java.util.Scanner;

public class 개수세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int count = 0;
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt(); 
			
		}
		int b =sc.nextInt();
		sc.close();
		
		for(int j =0; j<arr.length; j++) {
			if(arr[j]==b) {
				count++;
			}
		}
		System.out.println(count);
	}

}
