package algorithm.programmers._250424;

import java.util.Arrays;
public class _1로_만들기 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 1, 14};
	
		//내풀이
//		 int answer = 0;
//		for(int num : num_list) {
//			while(num > 1) {
//				if(num%2==0) {
//					 num=num/2;
//					 answer++;
//				}else {
//					 num=(num-1)/2;
//					 answer++;
//				}
//			}
//		}
//	
//		System.out.println(answer);
		
		
		//다른 방식의 풀이
		System.out.println(Arrays.stream(num_list).map(i -> Integer.toBinaryString(i).length() - 1).sum());
		/*
		 * */
	}

}
