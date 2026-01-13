package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class 할_일_목록 {

	public static void main(String[] args) {
		String[] todo_list= {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished= {true, false, true, false};

		List<String> answer = new ArrayList<>();
		for (int i = 0; i < finished.length; i++) {
			if(!finished[i]) {
				answer.add(todo_list[i]);
			}
		}
		System.out.println(answer);
	}

}
