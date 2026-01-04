package algorithm.programmers.Lv1;

import java.util.Arrays;

public class _x만큼_간격이_있는_n개의_숫자 {

	public static void main(String[] args) {
//		int x =-4;
//		int n =2;
//		int x =2;
//		int n =5;
		int x =4;
		int n =3;
		//내 풀이 
		long[] answer = new long[n];
		
		int index =0;
		if(x<0) {
			for(int i =x; i>=x*n; i+=x) {
				answer[index++] = i;
			}
			
		}else {
			for(int i =x; i<=x*n; i+=x) {
				answer[index++] = i;			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		//다른 풀이 https://techhan.github.io/algorithm/programmers-37/
//		long[] answer = new long[n];
//        long num = x;
//        for(int i = 0; i < answer.length; i++){
//            answer[i] = num;
//            num += x;
//        }
//        System.out.println(Arrays.toString(answer));
	}

}
