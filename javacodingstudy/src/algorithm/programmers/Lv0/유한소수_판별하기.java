package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유한소수_판별하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int A = a;
        int B = b;
        while (B != 0) {
            int num = A % B;
            A = B;
            B = num;

        }
        if (A == 1) {
            while (b % 2 == 0) b /= 2;
            while (b % 5 == 0) b /= 5;
        } else {
            b /= A;
            while (b % 2 == 0) b /= 2;
            while (b % 5 == 0) b /= 5;
        }
        int answer = b == 1 ? 1 : 2;
        System.out.println(answer);

    }
}