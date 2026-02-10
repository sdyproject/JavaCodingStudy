package algorithm.programmers.Lv0;

import java.util.ArrayList;
import java.util.Arrays;

public class _2의_영역 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 2, 1, 10, 2, 1};
//		int[] arr = {1, 2, 1};
//		int[] arr = {1,1,1};
//		int[] arr = {1, 2, 1, 4, 5, 2, 9};
		
		
		
		//다른 사람 풀이 
		int min = 100000, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
		
        int[] answer = Arrays.copyOfRange(arr, min, max+1);
        
        System.out.println(Arrays.toString(answer));
		//실패
//		String str = "";
//		
//		for(int i = 0; i < arr.length; i++) {
//			str+=arr[i];
//		}
//		System.out.println(str.indexOf('2'));
//
//		System.out.println(str.lastIndexOf('2',str.length()));
//		int[] answer = Arrays.copyOfRange(arr, str.indexOf('2'), str.lastIndexOf('2'));
//		System.out.println(Arrays.toString(answer));
		
//		
		//런타임 에러
//		int start= -1;
//		int end = -1;
//		ArrayList<Integer> answer = new ArrayList<>();
//		for(int i=0; i<arr.length; i++) {
//				if(arr[i]==2) {
//				start=i;
//				break;
//				}
//		}
//		
//		for(int i=arr.length-1; i>=0; i--) {
//			if(arr[i]==2) {
//			end=i;
//			break;
//			}
//	}
//		if(start==-1 && end==-1) {
//			answer.add(Integer.valueOf(-1));
//		}else {
//			int[] arr2 =Arrays.copyOfRange(arr, start, end+1);
//			for(int num : arr2) {
//				answer.add(num);
//			}
//			
//		}
//		System.out.println(start);
//		System.out.println(end);
//		
//		System.out.println(answer);
		
		
	}

}