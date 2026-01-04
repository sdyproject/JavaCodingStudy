package algorithm.programmers.Lv0;

import java.util.Scanner;

public class n의_배수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =sc.nextInt();
        
        int answer = (num%n == 0) ? 1 : 0;
        
        System.out.println(answer);
        
	}

}
