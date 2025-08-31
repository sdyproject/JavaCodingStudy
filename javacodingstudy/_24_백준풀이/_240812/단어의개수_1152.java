package _240812;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		
		sc.close();
		//방법1
		System.out.println(A.trim().split(" ").length);

		//방법2
		StringTokenizer st = new StringTokenizer(A);

			System.out.println(st.countTokens());
		
	}

}
