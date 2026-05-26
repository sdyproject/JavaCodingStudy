package algorithm.codeup.데이터정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 데이터_재정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }
        int[] clo = arr.clone();
        Arrays.sort(arr);
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (clo[i] == arr[j]) {
                    answer[i] = String.valueOf(j);
                    break;
                }
            }
        }

        System.out.println(String.join(" ", answer));
    }
}