package _240711;


public class 짝수곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		int total = 0 ;
		
		while(a<=50) {
			if(a % 2 == 0) {
				total = a;
			}
			a++;
		}
	System.out.println(total);
	}

}
