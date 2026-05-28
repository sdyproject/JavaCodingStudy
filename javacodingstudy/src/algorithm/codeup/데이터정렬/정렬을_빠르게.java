package algorithm.codeup.데이터정렬;

import java.io.*;
import java.util.StringTokenizer;

public class 정렬을_빠르게 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[100001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        for (int i = 0; i < 100000; i++) {
            while (arr[i] > 0) {
                bw.write(i + " ");
                arr[i]--;
            }
        }
        bw.flush();
        bw.close();
        br.close();

        //priorityqueue 풀이
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 0; i < N; i++) {
//            pq.add(Integer.parseInt(st.nextToken()));
//        }
//
//
//        for (int i = 0; i < N; i++) {
//            System.out.print(pq.poll() + " ");
//        }
    }
}