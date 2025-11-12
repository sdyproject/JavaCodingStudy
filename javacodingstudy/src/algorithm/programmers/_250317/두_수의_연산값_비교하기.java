package algorithm.programmers._250317;

public class 두_수의_연산값_비교하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 91;
		int b =2;
		
		int ab = Integer.parseInt(""+ a + b);
		int mul = 2*a*b;
		
		int answer = (ab>mul) ? ab : mul; 
		System.out.println(answer);
	}

}
