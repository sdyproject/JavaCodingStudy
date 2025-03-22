package _250322;

public class 수_조작하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String control ="wsdawsdassw";
		int n = 0;
		
		for(int i =0; i<control.length(); i++) {
			if(control.charAt(i)=='w') {
				n+=1;
			}else if(control.charAt(i)=='s') {
				n-=1;
			}else if(control.charAt(i)=='d') {
				n+=10;
			}else if(control.charAt(i)=='a') {
				n-=10;
			}
		}
		System.out.println(n);
		
//		기능은 작동하는데 프로그래머스에선 오류
//			for(int i=0; i<c.length(); i++) {
//		n= (c.charAt(i)=='w') ? n+=1:
//						 (c.charAt(i)=='s') ?  n-=1: 
//					     (c.charAt(i)=='d') ? n+=10 : n-10;
//
//			}
//			System.out.println(n);
	}

}
/*0 → 1 → 0 → 10 → 0 → 1 → 0 → 10 → 0 → -1 → -2 → -1*/
// 1 0 10 -10 1 0 10 -10 -1 -2 -1
