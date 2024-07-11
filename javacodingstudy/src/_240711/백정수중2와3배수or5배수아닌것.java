package _240711;

public class 백정수중2와3배수or5배수아닌것 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		
		int a = 1;
		
		int total = 0;
		
		
		
		while(a<=n) {
			if(a%2==0 && a%3==0 && a%5!=0) {
				total += a;
			}
		a++;	
		}
	System.out.println(total);	
	}
	
}
