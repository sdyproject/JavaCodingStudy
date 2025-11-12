package algorithm.programmers._250329;

import java.util.ArrayList;

public class _5명씩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"nami", "ahri", "jayce", "garen",
				"ivern", "vex", "jinx"};

		ArrayList<String> answer = new  ArrayList<>();
		
		for(int i = 0; i<names.length;i++) {
			
			if(i%5==0) {
				answer.add(names[i]);
			}
				
		}
		System.out.println(answer);
	
	}

}
