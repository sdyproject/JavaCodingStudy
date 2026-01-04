package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _5명씩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		
		 int index =0;
		String[] answer =new String[(names.length+4)/5];
		

		
		for(int i =0;i<names.length; i++) {
			if(i%5==0) {
				answer[index++]=names[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		
		// 배열리스트 사용한 풀이
//		 ArrayList<String> answer = new ArrayList<>();
		
//		for(int i =0;i<names.length; i++) {
//			if(i%5==0) {
//				answer.add(names[i]);
//			}
//		}
//		System.out.println(answer);
	}

}
