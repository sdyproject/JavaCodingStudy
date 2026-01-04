package algorithm.programmers.Lv0;

public class 홀수_vs_짝수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num_list = {4, 2, 6, 1, 7, 6};
		int[] num_list = {-1, 2, 5, 6, 3};
		int hall = 0;
		int jjag = 0;
		//int[] num_list = {-1, 2, 5, 6, 3};
		for(int i = 0; i<num_list.length; i+=2) {
			hall +=num_list[i];
		}
		
		for(int i = 1; i<num_list.length; i+=2) {
			jjag +=num_list[i];
		}
		
		int answer = (hall>jjag) ?  hall : jjag;
		System.out.println(answer);
	}

}
