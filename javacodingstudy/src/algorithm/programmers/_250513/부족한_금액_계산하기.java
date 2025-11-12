package algorithm.programmers._250513;

public class 부족한_금액_계산하기 {

	public static void main(String[] args) {
		int price=3;
		int money=20;
		int count=4;
		
		long sum =0;
		for(int i =price; i<=price*count; i+=price) {
			sum+=i;
		}
		
		long answer = (money>=sum) ? 0 : sum-money;
					   
		System.out.println(answer);
	}

}
