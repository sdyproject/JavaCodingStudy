package algorithm.programmers.Lv1;

import java.util.ArrayList;
import java.util.List;

public class 데이터_분석 {

    public static void main(String[] args) {
        /*data에서 ext값이 val_ext보다 작은 데이터만 뽑은후 sort_by에 해당하는 값을 기준으로 오름차순 정렬
         * */
        //data  [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)]
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        String[] context = {"code", "date", "maximum", "remain" };

        List<int[]> list = new ArrayList<>();
        int select = 0;
        int standard = 0;
        for (int i = 0; i < context.length; i++) {
            if (context[i].equals(ext)) {
                select = i;
            }
            if (context[i].equals(sort_by)) {
                standard = i;
            }
        }

        for (int i = 0; i < data.length; i++) {
            int[] arr = data[i];
            if (data[i][select] < val_ext) {
                list.add(arr);
            }
        }
        final int restandard = standard;
        list.sort(((o1, o2) -> Integer.compare(o1[restandard], o2[restandard])));

    }
}