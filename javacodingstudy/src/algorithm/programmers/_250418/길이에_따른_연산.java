	package algorithm.programmers._250418;
	
	public class 길이에_따른_연산 {
	
		public static void main(String[] args) {
	//		int[] num_list = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
			int[] num_list = {2,3,4,5};
			int answer=0;
			int sum =0;
			int mul =1;
			
			for(int num : num_list) {
				
				if(num_list.length>=11) {
					sum+=num;
					answer=sum;
				}else if(num_list.length<=10){
					
					mul *=num;
					answer =mul;
				}
			}
			
			System.out.println(answer);
			
	
			
		}
	
	}
