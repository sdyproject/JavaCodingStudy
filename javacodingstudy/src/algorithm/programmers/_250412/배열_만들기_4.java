package algorithm.programmers._250412;

import java.util.ArrayList;

public class 배열_만들기_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
//만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
//stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
//stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
		int[] arr = {1, 4, 2, 5, 3};
		ArrayList<Integer> answer = new ArrayList<>();
	
		
		
		for(int i = 0; i<arr.length; i++) {
			if(answer.size()==0) {
				answer.add(arr[i]);
			}
			else if(answer.get(answer.size()-1)<arr[i]) {
				
				answer.add(arr[i]);
				
			}else if(answer.get(answer.size()-1)>=arr[i]) {
				answer.remove(answer.get(answer.size()-1));
				i--;
			}	
		}
		
		
		
		System.out.println(answer);
		}

}
