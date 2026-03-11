package algorithm.programmers.Lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i * i; j < arr.length; j = j + i) {
                arr[j] = true;

            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}