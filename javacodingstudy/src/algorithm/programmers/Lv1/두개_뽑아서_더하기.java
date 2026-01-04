package algorithm.programmers.Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 두개_뽑아서_더하기 {

	public static void main(String[] args) {
	int[] numbers = {2,1,3,4,1}; //[2,3,4,5,6,7]
//	int[] numbers = {5,0,2,7};
//  int[] numbers = {3,3,4,4};	
	List<Integer> answer = new ArrayList<>();
	Arrays.sort(numbers);
	System.out.println(Arrays.toString(numbers));
	for(int i = 0; i<numbers.length; i++) {
		for(int j = i+1; j<numbers.length; j++) {
			if(!answer.contains(numbers[i]+numbers[j]))
				answer.add(numbers[i]+numbers[j]);
			
		}
	}
	Collections.sort(answer);
	System.out.println(answer);
	}

}
