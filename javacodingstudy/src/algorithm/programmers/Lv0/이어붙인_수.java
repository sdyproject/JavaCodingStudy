package algorithm.programmers.Lv0;

public class 이어붙인_수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num_list = {5,7,8,3};
		String sum1="";
		String sum2="";
		for(int num : num_list) {
			if(num%2==0) {
				sum2+=num;
			}else {
				sum1+=num;
			}
			
		}
	
		
		int answer = Integer.parseInt(sum2)+Integer.parseInt(sum1);
		
		
		System.out.println(answer);
				
	}

}
