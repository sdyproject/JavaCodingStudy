package _250427;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_3 {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 100, 99, 98};
//		int k =3;
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k =2;
		int[] answer = new int[arr.length];
		for(int i =0; i<arr.length; i++) {
			answer[i]=(k%2!=0) ? (int) arr[i]*k : arr[i]+k;
		
		}
		System.out.println(Arrays.toString(answer));
	}

}
