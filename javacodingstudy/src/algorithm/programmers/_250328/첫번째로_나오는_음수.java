package algorithm.programmers._250328;

public class 첫번째로_나오는_음수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num_list = {12, 4, 15, 46, 38, -2, 15};
		int[] num_list = {13, 22, 53, 24, 15, 6};

		 int answer = 0;
		for(int i=0; i<num_list.length; i++) {
			
			if(num_list[i]<0) {
				  answer = i;
				  break;
			}else {
				answer = -1;
			}
		}
		System.out.println(answer);
		
		
		
	}

}
