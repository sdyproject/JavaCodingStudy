package algorithm.programmers._250612;

import java.util.Arrays;

public class 과일_장수 {

	public static void main(String[] args) {
		int k =3; int m=4; int[] score= {1, 2, 3, 1, 2, 3, 1};
//		int k =4; int m=3; int[] score= {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		 int answer = 0;
		 int n = score.length/m;
		 int div = score.length % m;
	Arrays.sort(score);
	

	if(score.length % m !=0) {
		for(int i = 0; i < n; i++) {
	        answer += (score[div + (i*m)]) * m * 1;
	    }	
	}else {
		for(int i = 0; i < n; i++) {
	        answer += (score[(i*m)]) * m * 1;
	    }	
	}
    
	
    System.out.println(answer);
	}

}
