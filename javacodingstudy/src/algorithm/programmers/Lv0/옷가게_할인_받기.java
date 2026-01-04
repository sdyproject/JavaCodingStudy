package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 옷가게_할인_받기 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int price =  Integer.parseInt(br.readLine());
		
		int answer = (price >= 500000) ? (int) (price * 0.8) :
					 (price >= 300000) ? (int) (price * 0.9) :
					 (price >= 100000) ? (int) (price * 0.95) :
					 price;
		System.out.println(answer);
	}

}
