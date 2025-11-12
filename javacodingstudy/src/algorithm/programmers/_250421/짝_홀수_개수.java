package algorithm.programmers._250421;

import java.util.Arrays;

public class 짝_홀수_개수 {

	public static void main(String[] args) {
	//		int[] num_list ={1, 2, 3, 4, 5};
		int[] num_list ={1, 3, 5, 7};
		int[] answer =new int[2];
		
		int hol=0;
		int jjak =0;
		for(int num : num_list) {
			if(num%2==0) {
				jjak++;
				answer[0]=jjak;
			}else {
				hol++;
				answer[1]=hol;
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
