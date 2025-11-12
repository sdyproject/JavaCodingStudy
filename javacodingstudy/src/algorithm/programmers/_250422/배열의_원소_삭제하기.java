package algorithm.programmers._250422;

	import java.util.ArrayList;


public class 배열의_원소_삭제하기 {

	public static void main(String[] args) {
		int[] arr = {293, 1000, 395, 678, 94};
		int[] delete_list = {94, 777, 104, 1000, 1, 12};
		
		ArrayList<Integer> answer = new ArrayList<>();		
		
// 		기존 풀이하는던 방식
//	    if문에서 굳이 arr배열값을 얻은 answer값과 delete_list와 비교할 필요없이 
//		arr배열과 비교 후 배열리스트 answer에서 제거해주면 됐다.		
//		
//		for(int j =0; j<arr.length; j++) {
//			answer.add(arr[j]);
//			
//			System.out.println(answer.get(j));
//			for(int i =0; i<delete_list.length; i++) {
//				if(answer.get(j)==(delete_list[i])) {
//					answer.remove(Integer.valueOf(arr[j]));
//					}
//				
//				
//			}
//		}
//		System.out.println(answer);
	
		
		/*ArrayList remove 두가지 형태 존재
		 * 
		 * 1. remove (int index) : 해당 index 삭제
		 * 2. remove (Object o) : 해당 객체와 일치하는 것중  첫번째 요소 삭제
		 * 
		 * answer.remove(arr[i]); 시 arr[i]는 int형태로 1번 형태에 따라 진행되는데 해당 인덱스가 존재하질 않는데 
		 * ex) arr[i] == 100이고 answer배열 리스트엔 100번 존재하지 않는다.
		 * 이때 유효한 인덱스 범위를 넘어 IndexOutOfBoundsException이 발생
		 * 
		 * 2번째 방법을 통해 System.out.println(Integer.valueOf(arr[i])); 작성하여 
		 * 해당 객체와 일치하는 값을 제거하는 방식으로 진행해야한다.
		 * 
		 * */
		
		
		
		
		for(int i = 0; i<arr.length; i++) {
			answer.add(arr[i]);
			for(int j = 0; j<delete_list.length; j++) {
				if(arr[i]==delete_list[j]) {
			answer.remove(Integer.valueOf(arr[i]));
//					System.out.println(Integer.valueOf(arr[i]));
//					System.out.println(arr[i]);
					
					
				}
			}
		}
		System.out.println(answer);
	}

}
