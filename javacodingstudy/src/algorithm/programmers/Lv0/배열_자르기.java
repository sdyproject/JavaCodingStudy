package algorithm.programmers.Lv0;

import java.util.Arrays;

public class 배열_자르기 {

	public static void main(String[] args) {
//		int[] numbers={1, 2, 3, 4, 5}; 
//		int num1 = 1; int num2 =3;
		int[] numbers={1, 3, 5}; 
		int num1 = 1; int num2 =2;
		 int[] answer = new int[(num2-num1)+1];
		int index =0;
		 for(int i =num1; i<=num2; i++) {
	       answer[index++] += numbers[i];
		}
		 System.out.println(Arrays.toString(answer));
	}

}
