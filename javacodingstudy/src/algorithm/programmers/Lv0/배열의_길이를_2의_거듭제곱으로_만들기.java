package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {

	public static void main(String[] args) {

//		int[] arr = {58, 172, 746, 89};
        int[] arr = {1, 2, 3, 4, 5, 6};
        int len = arr.length;
        while(len % 2 == 0){
            len /= 2;
        }
        System.out.println(len);
			
	}

}
