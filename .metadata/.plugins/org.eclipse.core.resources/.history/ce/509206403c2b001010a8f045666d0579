package _250406;

public class 배열_비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {49, 13}; 
//		int[] arr2 = {70, 11, 2};

//				int[] arr = {100, 17, 84, 1}; 
//				int[] arr2 = {55, 12, 65, 36};

				int[] arr = {1, 2, 3, 4, 5}; 
				int[] arr2 = {3, 3, 3, 3, 3};
		
		int answer =0;
		int arr_len = arr.length;
		int arr2_len = arr2.length;
		int arrsum = 0;
		int arr2sum = 0;
		
		if(arr_len != arr2_len) {
			answer = (arr_len>arr2_len) ? 1 : -1;
		}else {
			for(int num : arr) {
				arrsum+=num;
			}
			for(int num2 : arr2) {
				arr2sum+=num2;
			}
			answer = (arrsum>arr2sum) ? 1 : 
				(arrsum<arr2sum) ? -1 :
				 0;	
		}
		System.out.println(answer);
	}

}
