package _240815;

import java.util.ArrayList;
import java.util.Scanner;

public class 약수들의합_9506 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		 		
		int A = sc.nextInt();
		if(A == -1) break;
		
		ArrayList<Integer> Array = new ArrayList<Integer>();
		
		int sum=0;
		
		for(int i =1; i<A; i++) {
			if(A%i == 0 ) {
				Array.add(i);
				sum+=i;
				
			
			}
		}
		System.out.println(Array);
		System.out.println(sum);
			if(sum!=A) {
				System.out.println(A+" is NOT perfect.");
				continue;
			}else {
				
				System.out.print(A +" = ");
				
				 for(int i =0; i<Array.size(); i++) {
					 System.out.println("Array.get(0) :"+Array.get(0));
					 if(Array.get(i)==1) {
							System.out.print(Array.get(i));
						} else {
						System.out.print(" + "+Array.get(i));
						}
				  }
				 sc.close();
				 System.out.println();
			}
		
		
		 		
		 
		 
		
		}
		
		

	}

}
