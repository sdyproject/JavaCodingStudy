package _250430;

import java.util.ArrayList;
import java.util.Arrays;

public class _x_사이의_개수 {

	public static void main(String[] args) {
//		String myString = "oxooxoxxox"; // [1, 2, 1, 0, 1, 0]
		String myString = "xabcxdefxghi";  //[0, 3, 3, 3]

		//제한없이 나누지만 빈문자열 제가
		   String[] c =myString.split("x");
		 //4번만큼 나누기
		   String[] b =myString.split("x",5);	
		   //제한없이 나누지만 빈문자열 포함
		   String[] a =myString.split("x", -1);
		   
		   
		   
		   
		  System.out.println(Arrays.toString(b));
		  
		   int[] answer = new int[a.length];
		   for(int i =0; i<a.length; i++) {
			  answer[i] = a[i].length();
		   }
		   System.out.println(Arrays.toString(answer));
	}

}
