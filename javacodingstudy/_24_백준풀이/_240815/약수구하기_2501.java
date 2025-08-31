package _240815;

import java.util.Scanner;

public class 약수구하기_2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A  = sc.nextInt();
		int B = sc.nextInt();
		int count =0;
			if(A%B==0) {
				for(int i =1; i<=B; i++) {
					if(A%i==0) {
						count+=1;
						
				}
			}
				
			
		}
			sc.close();
			System.out.println(count);

	}

}
