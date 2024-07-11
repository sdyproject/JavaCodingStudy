package _240711;

public class 최댓값최솟값의곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,6,-7,16};
		
		//배열의 첫번째값 '1' max값으로 초기화
		int max = array[0];
		//배열의 첫번째값 '1' min값으로 초기화
		int min = array[0];
		
		//배뎔의 요소 순회
		for(int n : array) {
			
			//현재값이 max값 비교 
			//첫번째 반복 : n == '1' , max == '1'  => max 업데이트 x
			//min같은 경우도 업데이트 x
			//두번째 반복 : 배열 순회로 n == '5' max == '1' =>max 업데이트 max == 5;
			//min n == '5' < min == '1' 업데이트 x
			if(n > max) {
				//최댓값을 현재요소를 업데이트
				max = n;
			}
			//현재값이 min값 비교
			if(n< min) {
				//최소값을 현재요소로 업데이트
				min =n;
			}
		}
		//총합 = 최댓값 + 최소값
		int sum = max + min;
		
		 // 최댓값 출력
        System.out.println("가장 큰 수: " + max); // 출력: 가장 큰 수: 16
        // 최솟값 출력
        System.out.println("가장 작은 수: " + min); // 출력: 가장 작은 수: -7
        // 합계 출력
        System.out.println("합: " + sum); // 출력: 합: 9
	}

}
