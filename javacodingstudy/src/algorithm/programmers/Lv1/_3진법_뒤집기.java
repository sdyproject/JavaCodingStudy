package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3진법_뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        int answer = 0;
        for (int i = 0; i < sb.length(); i++) {
            answer = answer * 3 + (sb.charAt(i) - '0');
        }
        System.out.println(answer);

//        Integer.parseInt(sb.append(Integer.toString(n, 3)).reverse().toString(),3);

    }
}