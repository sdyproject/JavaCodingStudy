package _250625;

import java.util.Arrays;

public class 가장_가까운_글자 {

	public static void main(String[] args) {
//		String s  ="banana"; // -1, -1, -1, 2, 2, 2
		String s  ="foobar"; // -1, -1, 1, -1, -1, -1

		int[] answer = new int[s.length()];
		for(int i =0; i<s.length(); i++) {
			
			if(i==0) {
				answer[i] = -1;
				continue;
			}
			//lastIndexof : 오른쪽부터 문자열왼쪽 탐색
			// lastIndexOf(char ch(String str), int fromIndex)
			// 탐색 시점을 i-1해서 현재 데이터를 제외한 왼쪽 데이터만 탐색
			
			int count=s.lastIndexOf(s.charAt(i), i-1);
			//탐색 후 같은 데이터 없을 시 -1를 반환하기 때문에 조건절 이용
			// 탐색 후 왼쪽에  같은 데이터가 없다면-1를 반환하고 
			// -1아니고 왼쪽에 같은 데이터 존재 시 현재 인덱스에서 왼쪽에 있는 인덱스 차를 반환
			answer[i] = (count!=-1) ? i-count : count;

			
		}
		
		System.out.println(Arrays.toString(answer));
		
	}

}
