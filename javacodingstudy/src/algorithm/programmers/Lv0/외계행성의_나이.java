package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 외계행성의_나이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        String str = "abcdefghij";
        String answer = "";
        String[] arr = String.valueOf(age).split("");
        for (int i = 0; i < arr.length; i++) {
            answer += str.charAt(Integer.parseInt(arr[i]));
        }

        System.out.println(answer);
    }
}
