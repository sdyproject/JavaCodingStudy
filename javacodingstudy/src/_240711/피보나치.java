package _240711;

public class 피보나치 {
    public static int fibonacci(int n) {
    	
    	if(n==0) return 0;
    	
    	if(n==1) return 1;
    	
    	return fibonacci(n-1) + fibonacci(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(fibonacci(3));
	      
	    
	}

}
