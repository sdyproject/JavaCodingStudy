package algorithm.programmers.Lv1;

public class 푸드_파이트_대회 {

	public static void main(String[] args) {
//		int [] food = {1,3,4,6};
		
		
		int [] food = {1,7,1,2};
		
		// 조건
		// 배열의 순서는 칼로리가 낮은순으로 정렬하고 음식의 종류와 양이 같음
		// 두 선수 출전하고 한 선수는 왼쪽부터 오른쪽으로 한 선수는 오른쪽에서 왼쪽으로 먹는 방식 진행
		// 배열의 food[0] 물로 항상 1의 값을 가짐
		
		String answer = "";
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<food.length; i++) {
			int count = food[i] / 2;
			
			for (int j = 0; j < count; j++) {
				sb.append(String.valueOf(i)); 
			}
			}
		
		
		String l =  sb.toString();
		String r =  sb.reverse().toString();
		
		answer+= l + 0 + r;
		System.out.println(answer);
	}

}
