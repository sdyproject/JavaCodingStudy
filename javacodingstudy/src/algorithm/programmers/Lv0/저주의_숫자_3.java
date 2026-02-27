package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    
public class 저주의_숫자_3 {
    public static void main(String[] args) throws IOException {
        // 3의 배수와 숫자 3를 사용하지 않음 n의 결과
        // 1=1  2=2 3=4 4=5 5=7 ~
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (String.valueOf(answer).contains("3") || answer % 3 == 0) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
