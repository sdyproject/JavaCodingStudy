package algorithm.programmers.Lv0;

public class 수박수박수박수박수박수 {

	public static void main(String[] args) {
		int n =3;
        String answer = "";
        
        for(int i =1; i<=n; i++) {
        	answer+=(i%2==0) ? "박":"수";
        }
		
		System.out.println(answer);
	}

}
