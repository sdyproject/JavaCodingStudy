package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 10; i >= 1 ; i--) {
            if(n >= factorial(i)){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }

        return num * factorial(num -1);
    }
}